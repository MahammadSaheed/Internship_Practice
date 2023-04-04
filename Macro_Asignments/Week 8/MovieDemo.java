import java.util.*;

class Movie implements Comparable<Movie> {
  String m_title;
  String d_name;
  int r_year;

  Movie(String m_title, String d_name, int r_year) {
    this.m_title = m_title;
    this.d_name = d_name;
    this.r_year = r_year;
  }

  public int compareTo(Movie mov) {
    if (r_year > mov.r_year) {
      return 1;
    } else if (r_year < mov.r_year) {
      return -1;
    } else {
      return 0;
    }
  }

  public String getM_title() {
    return m_title;
  }

  public void setM_title(String m_title) {
    this.m_title = m_title;
  }

  public String getD_name() {
    return d_name;
  }

  public void setD_name(String d_name) {
    this.d_name = d_name;
  }

  public int getR_year() {
    return r_year;
  }

  public void setR_year(int r_year) {
    this.r_year = r_year;
  }
}

class MovieDemo {
  public static void main(String args[]) {
    ArrayList<Movie> movies = new ArrayList<Movie>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      movies.add(new Movie(sc.next(), sc.next(), sc.nextInt()));
    }
    Collections.sort(movies);
    for (Movie mov : movies) {
      System.out.println(mov.getM_title() + " " + mov.getD_name() + " " + mov.getR_year());
    }
  }
}
