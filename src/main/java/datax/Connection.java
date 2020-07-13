/**
  * Copyright 2020 bejson.com 
  */
package datax;
import java.util.List;

/**
 * Auto-generated: 2020-07-13 11:19:37
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Connection {

    private List<String> querySql;
    private List<String> jdbcUrl;
    public void setQuerySql(List<String> querySql) {
         this.querySql = querySql;
     }
     public List<String> getQuerySql() {
         return querySql;
     }

    public void setJdbcUrl(List<String> jdbcUrl) {
         this.jdbcUrl = jdbcUrl;
     }
     public List<String> getJdbcUrl() {
         return jdbcUrl;
     }

}