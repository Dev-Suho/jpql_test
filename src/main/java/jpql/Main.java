package jpql;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String query = "select " +
                "case when m.age <= 10 then '학생요금' " +
                " when m.age >= 60 then '경로요금' " +
                " else '일반요금' " +
                "end " +
                "from Member m";

       // List<String> result = em.createQuery(query, String.class)
          //      .getResultList();
    }
}
