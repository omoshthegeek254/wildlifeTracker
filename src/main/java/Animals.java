package models;
import org.sql2o.Connection;

import java.util.List;

public class Animals {
    private String name;
    private String age;
    private Boolean endangered;
    private Boolean healthy;

    public Animals(String name, String age, Boolean endangered, Boolean healthy) {
        this.name = name;
        this.age = age;
        this.endangered = endangered;
        this.healthy = healthy;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Boolean getEndangered() {
        return endangered;
    }

    public Boolean getHealthy() {
        return healthy;
    }

    @Override
    public boolean equals(Object otherAnimal){
        if (!(otherAnimal instanceof Animals)) {
            return false;
        } else {
            Animals newAnimal = (Animals) otherAnimal;
            return this.getName().equals(newAnimal.getName()) &&
                    this.getAge().equals(newAnimal.getAge())&&
                    this.getEndangered().equals(newAnimal.getEndangered())&&
                    this.getHealthy().equals(newAnimal.getHealthy());
        }
    }

    public void save() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO persons (name, email) VALUES (:name, :email)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("email", this.email)
                    .executeUpdate()
                    .getKey();
        }
    }


}
