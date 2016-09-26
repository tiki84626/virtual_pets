import org.sql2o.*;

public class DB {
  public static Sql2o sql2o = new Sql2ol("jbdc:postgresql://localhost:5432/ " +
                                         "virtual_pets", null, null);
}
