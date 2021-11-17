import authorization.Authorization;
import builder.ReportBuilder;
import db.Database;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder builder = new ReportBuilder(db);
        }
    }
}
