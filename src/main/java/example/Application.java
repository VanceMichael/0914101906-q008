package example;

import io.javalin.Javalin;
import java.sql.DriverManager;

public final class Application {
  static String databasePath() {
    return System.getenv().getOrDefault("RAFTING_DB_PATH", "rafting-coordination.db");
  }

  static void checkDatabase() throws Exception {
    try (var connection = DriverManager.getConnection("jdbc:sqlite:" + databasePath());
         var statement = connection.createStatement()) {
      statement.execute("select 1");
    }
  }

  public static void main(String[] args) throws Exception {
    checkDatabase();
    Javalin.create().get("/health", context -> context.json("{\"status\":\"ok\"}"))
        .start(Integer.parseInt(System.getenv().getOrDefault("PORT", "8080")));
  }
}
