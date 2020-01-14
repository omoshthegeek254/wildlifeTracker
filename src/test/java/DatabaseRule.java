import org.junit.rules.ExternalResource;
<<<<<<< HEAD
import org.sql2o.Connection;
import org.sql2o.Sql2o;
=======
import org.sql2o.*;
>>>>>>> copy1

public class DatabaseRule extends ExternalResource {

    @Override
    protected void before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "moringa", "@qwerty");
    }

    @Override
    protected void after() {
        try(Connection con = DB.sql2o.open()) {
<<<<<<< HEAD
            String deleteAnimalsQuery = "DELETE FROM animals *;";
//            String deleteSightingsQuery = "DELETE FROM sightings *;";
            con.createQuery(deleteAnimalsQuery).executeUpdate();
//            con.createQuery(deleteSightingsQuery).executeUpdate();
=======
            String deleteSightingQuery = "DELETE FROM sightings *;";
            String deleteAnimalQuery = "DELETE FROM animals *;";
            con.createQuery(deleteSightingQuery).executeUpdate();
            con.createQuery(deleteAnimalQuery).executeUpdate();

>>>>>>> copy1
        }
    }

}