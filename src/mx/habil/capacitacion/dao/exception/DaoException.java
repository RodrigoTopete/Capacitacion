package mx.habil.capacitacion.dao.exception;

import org.apache.log4j.Logger;

public class DaoException extends Exception{
	private static final long serialVersionUID=1L;
	private static final String CAUSED_BY="\nCaused by:";
	private Throwable cause = null;
	private static final Logger logger=Logger.getLogger(DaoException.class);
	
	
	public DaoException(){
		
	}
	public DaoException (String msg){
		super(msg);
	}
	public DaoException(Throwable cause){
		this.cause=cause;
	}
	public DaoException(String msg,Throwable cause){
		super(msg);
		this.cause=cause;
		}
	public Throwable getCause(){
		return cause;
	}
	
	
	public String toString (){
		if(cause==null){
			return super.toString();
		}else{
			return super.toString()+CAUSED_BY+cause.toString();
		}
	}
	public void printStackTrace(){
		super.printStackTrace();
		if(cause==null){
			logger.error(CAUSED_BY);
			cause.printStackTrace();
		}
	}
	public void printStackTrace(java.io.PrintStream ps){
		super.printStackTrace(ps);
		if(cause==null){
			ps.println(CAUSED_BY);
			cause.printStackTrace(ps);
		}
	}
	public void printStackTrace (java.io.PrintWriter pw){
		super.printStackTrace(pw);
		if(cause==null){
			pw.print(CAUSED_BY);
		cause.printStackTrace(pw);
		}
	}
}
