import java.time.DayOfWeek;
import java.time.LocalDate;

class Meetup {
    int monthOfYear;
    int year;
    Meetup(int monthOfYear, int year) {
        this.monthOfYear = monthOfYear;
        this.year = year;
    }

    LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule schedule) {
        LocalDate mtp =LocalDate.of(year, monthOfYear, 1);
        switch (schedule) {
            case FIRST:
                while (mtp.getDayOfWeek() != dayOfWeek) {
                    mtp = mtp.plusDays(1);
                }
                break;
            case SECOND:
                mtp = mtp.withDayOfMonth(8);
                while (mtp.getDayOfWeek() != dayOfWeek) {
                    mtp = mtp.plusDays(1);
                }
                break;
            case THIRD:
                mtp = mtp.withDayOfMonth(15);
                while (mtp.getDayOfWeek() != dayOfWeek) {
                    mtp = mtp.plusDays(1);
                }
                break;
            case FOURTH:
                mtp = mtp.withDayOfMonth(22);
                while (mtp.getDayOfWeek() != dayOfWeek) {
                    mtp = mtp.plusDays(1);
                }
                break;
            case LAST:
                mtp = mtp.withDayOfMonth(mtp.lengthOfMonth());
                while (mtp.getDayOfWeek() != dayOfWeek) {
                    mtp = mtp.minusDays(1);
                }
                break;
            case TEENTH:
                mtp = mtp.withDayOfMonth(13);
                while (mtp.getDayOfWeek() != dayOfWeek) {
                    mtp = mtp.plusDays(1);
                }
                break;
        
            default:
                break;
        }
        return mtp;
    }

}