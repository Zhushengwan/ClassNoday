package args.Meiju;

public class Weeks {

    public static String  getWeek(Week week) {

        switch (week) {

            case MON:

                return Week.MON.getXingqi();

            case TUE:

                return Week.TUE.getXingqi();

            case WEN:

                return Week.WEN.getXingqi();

            case THUS:

                return Week.THUS.getXingqi();

            case FRI:

                return Week.FRI.getXingqi();

            case SAN:

                return Week.SAN.getXingqi();

            case SUN:

                return Week.SUN.getXingqi();

                default:

                    return null;

        }
    }
}
