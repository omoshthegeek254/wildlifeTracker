import org.sql2o.Sql2o;

public class DB {
    //    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "moringa", "@qwerty");
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-174-129-33-176.compute-1.amazonaws.com:5432/dfq9hqlo3csq93", "moringa", "@qwerty");

}