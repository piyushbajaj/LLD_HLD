package LLD.Concept_And_Coding.L14_BookMyShow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import LLD.Concept_And_Coding.L14_BookMyShow.Enum.City;
import LLD.Concept_And_Coding.L14_BookMyShow.Enum.SeatCategory;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L14_BookMyShow
 * <p>
 * User: piyushbajaj
 * Date: 08/04/23
 * Time: 6:10 pm
 */

public class BookMyShow {
    S7_TheatreController theatreController;
    S2_MovieController movieController;

    BookMyShow() {
        theatreController = new S7_TheatreController();
        movieController = new S2_MovieController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();

        // user 1
        bookMyShow.createBooking(City.Bangalore, "Avengers");
        // user 2
        bookMyShow.createBooking(City.Bangalore, "Avengers");
    }

    private void createBooking(City userCity, String movieName) {

        //1. search movie by my location
        List<S1_Movie> movies = movieController.getCityWiseMovies().get(userCity);

        //2. select the movie which you want to see.
        S1_Movie interestedMovie = null;
        for (S1_Movie movie : movies) {

            if ((movie.getMovieName()).equals(movieName)) {
                interestedMovie = movie;
            }
        }

        //3. get all show of this movie in Bangalore location
        Map<S3_Theatre, List<S5_Show>> showsTheatreWise =
            theatreController.getTheatreWiseShows(interestedMovie, userCity);

        //4. select the particular show, user is interested in
        Map.Entry<S3_Theatre, List<S5_Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<S5_Show> runningShows = entry.getValue();
        S5_Show interestedShow = runningShows.get(0);

        //5. select the seat
        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIds();
        if (!bookedSeats.contains(seatNumber)) {

            bookedSeats.add(seatNumber);
            //startPayment
            S8_Booking booking = new S8_Booking();
            List<S6_Seat> myBookedSeats = new ArrayList<>();
            for (S6_Seat screenSeat : interestedShow.getScreen().getSeatList()) {
                if (screenSeat.getSeatId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeats(myBookedSeats);
            booking.setShow(interestedShow);
        } else {
            //throw exception
            System.out.println("seat already booked, try again");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");
    }


    private void initialize() {
        // create movies
        createMovies();

        // create theatres
        createTheatre();
    }

    private void createMovies() {
        // create movie 1
        S1_Movie avengers = new S1_Movie();
        avengers.setMovieId(1);
        avengers.setMovieName("Avengers");
        avengers.setMovieDurationInMinutes(128);

        // create movie 2
        S1_Movie pirateOfTheCaribbean = new S1_Movie();
        pirateOfTheCaribbean.setMovieId(2);
        pirateOfTheCaribbean.setMovieName("Pirates of the Caribbean");
        pirateOfTheCaribbean.setMovieDurationInMinutes(180);

        movieController.addMovie(avengers, City.Bangalore);
        movieController.addMovie(avengers, City.Delhi);
        movieController.addMovie(pirateOfTheCaribbean, City.Bangalore);
        movieController.addMovie(pirateOfTheCaribbean, City.Delhi);
    }

    private void createTheatre() {
        S1_Movie avengersMovie = movieController.getMovieByName("Avengers");
        S1_Movie piratesMovie = movieController.getMovieByName("Pirates of the Caribbean");

        S3_Theatre inoxTheatre = new S3_Theatre();
        inoxTheatre.setTheatreId(1);
        inoxTheatre.setScreenList(createScreen());
        inoxTheatre.setCity(City.Bangalore);
        List<S5_Show> inoxShows = new ArrayList<>();
        S5_Show inoxMorningShow = createShows(1, inoxTheatre.getScreenList().get(0), avengersMovie, 8);
        S5_Show inoxEveningShow = createShows(2, inoxTheatre.getScreenList().get(0), piratesMovie, 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShowList(inoxShows);

        S3_Theatre pvrTheatre = new S3_Theatre();
        pvrTheatre.setTheatreId(2);
        pvrTheatre.setScreenList(createScreen());
        pvrTheatre.setCity(City.Delhi);
        List<S5_Show> pvrShows = new ArrayList<>();
        S5_Show pvrMorningShow = createShows(3, pvrTheatre.getScreenList().get(0), avengersMovie, 13);
        S5_Show pvrEveningShow = createShows(4, pvrTheatre.getScreenList().get(0), piratesMovie, 20);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShowList(pvrShows);

        theatreController.addTheatre(inoxTheatre, City.Bangalore);
        theatreController.addTheatre(pvrTheatre, City.Delhi);
    }

    private List<S4_Screen> createScreen() {
        List<S4_Screen> screens = new ArrayList<>();
        S4_Screen screen1 = new S4_Screen();
        screen1.setScreenId(1);
        screen1.setSeatList(createSeats());
        screens.add(screen1);

        return screens;
    }

    private List<S6_Seat> createSeats() {
        List<S6_Seat> seats = new ArrayList<>();

        // Silver: 1 to 40
        for (int i = 1; i <= 40; i++) {
            S6_Seat seat = new S6_Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        // Silver: 1 to 40
        for (int i = 41; i <= 70; i++) {
            S6_Seat seat = new S6_Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        // Silver: 1 to 40
        for (int i = 71; i <= 100; i++) {
            S6_Seat seat = new S6_Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }

    private S5_Show createShows(int showId, S4_Screen screen, S1_Movie movie, int showStartTime) {
        S5_Show show = new S5_Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime);

        return show;
    }
}
