public class enumExample {

     enum  Currency {
      USD, EUR, GBP, INR,  CNY;
     }

     enum  Month {
      JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
      }

     enum UserRole {
       ADMIN, USER, GUEST;
       }
       
     enum Suit {
       HEARTS, DIAMONDS, CLUBS, SPADES;
     }

     enum Planet {
       MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE;
      }

     enum DayOfWeek {
       SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
     }
 
      enum TrafficLight {
         RED, YELLOW, GREEN;
      }

      enum Season {
       WINTER, SPRING, SUMMER ;
      }

       enum Rank {
         ACE, JACK, QUEEN, KING;
       }

       enum PriorityLevel {
         LOW, MEDIUM, HIGH;
       }

        public static void main(String[] args) {

            Currency currency = Currency.USD;
             System.out.println(currency);

             Month month =  Month.OCTOBER;
             System.out.println(month);

             UserRole userrole = UserRole.ADMIN;
              System.out.println(userrole);

              Suit suit = Suit.CLUBS;
              System.out.println(suit);

              Planet planet = Planet.SATURN;
              System.out.println(planet);

              DayOfWeek dayofweek =DayOfWeek.SUNDAY;
               System.out.println(dayofweek);
             
              TrafficLight trafficlight = TrafficLight.GREEN;
               System.out.println(trafficlight);
 
              Season season = Season.SUMMER;
              System.out.println(season);
 
              Rank rank = Rank.QUEEN;
              System.out.println(rank);

              PriorityLevel prioritylevel = PriorityLevel.MEDIUM;
              System.out.println(prioritylevel);             

  }
}
      

     