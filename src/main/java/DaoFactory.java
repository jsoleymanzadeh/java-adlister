import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            try {
                adsDao = new MySQLAdsDao(new Config());
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return adsDao;
    }
}