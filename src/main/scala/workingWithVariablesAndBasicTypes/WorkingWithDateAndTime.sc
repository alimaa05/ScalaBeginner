import java.time._ // underscore means import everything at this level (equivalent to * in java)

// Local Date
// returns the local date based on today
LocalDate.now()

// to create local date instance form diff date there's diff static methods that can be used
val date_1 = LocalDate.of(2018, 12, 5)

// other methods that can be used along side them

date_1.isAfter(res0)

date_1.isBefore(res0)

// Local Time
// local time similar process to local date

LocalTime.now()

val time_1 = LocalTime.of(14,30,22)

// LocalDateTime

LocalDateTime.now()

val dateTime = LocalDateTime.of(2000,2,5,16,31)

dateTime.plusYears(21)

dateTime.minusYears(20)

ZonedDateTime.now()

// returns a set of all zone IDs that you can use
ZoneId.getAvailableZoneIds()

// can create an instance of ZoneDateTime based on diff inputs
val ZoneDateTime = ZonedDateTime.of(LocalDateTime.now,ZoneId.of("America/Vancouver"))