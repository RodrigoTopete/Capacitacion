package mx.habil.capacitacion.dao.hql;

import java.util.Map;

import org.apache.log4j.Logger;

public abstract class UniversidadAbstractHQLHelper  {

	private static final Logger logger = Logger.getLogger(UniversidadAbstractHQLHelper.class);

    private Map<String, String> queries;


    public String getHQL(String id){
        logger.debug("Inicio");
        String query = (String)queries.get(id);
        if(query==null){
            throw new NullPointerException("El id:"+id+", no existe en el mapa de Queries.");
        }
        logger.debug("Fin");
        return query;
    }
    
    public Map<String,String> getQueries() {
        return queries;
    }

    public void setQueries(Map<String,String> queries) {
        this.queries = queries;
    }





}
