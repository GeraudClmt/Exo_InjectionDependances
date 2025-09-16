package com.welcome;

import com.welcome.fakeClass.FakeCalendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class WelcomeTest {
   @Nested
   @DisplayName("Test Monday")
   class TestMonday{
       @Test
       @DisplayName("Should Bonjour at Monday 10h")
       void shouldBonjourAtMonday10H() {
           FakeCalendar fakeCalendar = new FakeCalendar(1, 10);
           Welcome welcome = new Welcome(fakeCalendar);
           Assertions.assertEquals("Bonjour", welcome.getMessage());
       }

       @Test
       @DisplayName("Should Bon après-midi at Monday 14h")
       void shouldBonApresMidiAtMonday14H() {
           FakeCalendar fakeCalendar = new FakeCalendar(1, 14);
           Welcome welcome = new Welcome(fakeCalendar);
           Assertions.assertEquals("Bon après-midi", welcome.getMessage());
       }

       @Test
       @DisplayName("Should Bonsoir at Monday 19h")
       void shouldBonsoirAtMonday19H() {
           FakeCalendar fakeCalendar = new FakeCalendar(1, 19);
           Welcome welcome = new Welcome(fakeCalendar);
           Assertions.assertEquals("Bonsoir", welcome.getMessage());
       }

       @Test
       @DisplayName("Should Bon week-end at Monday 8h")
       void shouldBonWeekEndAtMonday8H() {
           FakeCalendar fakeCalendar = new FakeCalendar(1, 8);
           Welcome welcome = new Welcome(fakeCalendar);
           Assertions.assertEquals("Bon week-end", welcome.getMessage());
       }
   }

    @Nested
    @DisplayName("Test Tuesday")
    class TestTuesday{
        @Test
        @DisplayName("Should Bonjour at Tuesday 10h")
        void shouldBonjourAtTuesday10H() {
            FakeCalendar fakeCalendar = new FakeCalendar(2, 10);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bonjour", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bon après-midi at Tuesday 16h")
        void shouldBonApresMidiAtTuesday16H() {
            FakeCalendar fakeCalendar = new FakeCalendar(2, 16);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon après-midi", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bonsoir at Tuesday 21h")
        void shouldBonsoirAtTuesday21H() {
            FakeCalendar fakeCalendar = new FakeCalendar(2, 5);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bonsoir", welcome.getMessage());
        }


    }

    @Nested
    @DisplayName("Test Wednesday")
    class TestWednesday {
        @Test
        @DisplayName("Should Bonjour at Wednesday 10h")
        void ShouldBonjourAtWednesday10H() {
            FakeCalendar fakeCalendar = new FakeCalendar(3, 10);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bonjour", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bon après-midi at Wednesday 16h")
        void shouldBonApresMidiAtWednesday16H() {
            FakeCalendar fakeCalendar = new FakeCalendar(3, 16);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon après-midi", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bonsoir at Wednesday 21h")
        void shouldBonsoirAtWednesday21H() {
            FakeCalendar fakeCalendar = new FakeCalendar(3, 5);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bonsoir", welcome.getMessage());
        }

    }
    @Nested
    @DisplayName("Test Thursday")
    class TestThursday {
        @Test
        @DisplayName("Should Bonjour at Thursday 10h")
        void ShouldBonjourAtThursday10H() {
            FakeCalendar fakeCalendar = new FakeCalendar(4, 10);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bonjour", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bon après-midi at Thursday 16h")
        void shouldBonApresMidiAtThursday16H() {
            FakeCalendar fakeCalendar = new FakeCalendar(4, 16);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon après-midi", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bonsoir at Thursday 21h")
        void shouldBonsoirAtThursday21H() {
            FakeCalendar fakeCalendar = new FakeCalendar(4, 5);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bonsoir", welcome.getMessage());
        }

    }
    @Nested
    @DisplayName("Test Friday")
    class TestFriday {
        @Test
        @DisplayName("Should Bonjour at Friday 10h")
        void ShouldBonjourAtFriday10H() {
            FakeCalendar fakeCalendar = new FakeCalendar(5, 10);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bonjour", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bon après-midi at Friday 16h")
        void shouldBonApresMidiAtFriday16H() {
            FakeCalendar fakeCalendar = new FakeCalendar(5, 16);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon après-midi", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bonsoir at Friday 21h")
        void shouldBonsoirAtFriday21H() {
            FakeCalendar fakeCalendar = new FakeCalendar(5, 5);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bonsoir", welcome.getMessage());
        }
        @Test
        @DisplayName("Should Bon week end at Friday 19h")
        void shouldBonWeekEndAtFriday16H() {
            FakeCalendar fakeCalendar = new FakeCalendar(5, 19);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon week-end", welcome.getMessage());
        }

    }

    @Nested
    @DisplayName("Test Saturday")
    class TestSaturday {
        @Test
        @DisplayName("Should Bonjour at Saturday 10h")
        void ShouldBonjourAtSaturday10H() {
            FakeCalendar fakeCalendar = new FakeCalendar(6, 10);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon week-end", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bon après-midi at Saturday 16h")
        void shouldBonApresMidiAtSaturday16H() {
            FakeCalendar fakeCalendar = new FakeCalendar(6, 16);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon week-end", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bonsoir at Saturday 21h")
        void shouldBonsoirAtSaturday21H() {
            FakeCalendar fakeCalendar = new FakeCalendar(6, 5);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon week-end", welcome.getMessage());
        }

    }

    @Nested
    @DisplayName("Test Sunday")
    class TestSunday {
        @Test
        @DisplayName("Should Bonjour at Sunday 10h")
        void ShouldBonjourAtSunday10H() {
            FakeCalendar fakeCalendar = new FakeCalendar(0, 10);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon week-end", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bon après-midi at Sunday 16h")
        void shouldBonApresMidiAtSunday16H() {
            FakeCalendar fakeCalendar = new FakeCalendar(0, 16);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon week-end", welcome.getMessage());
        }

        @Test
        @DisplayName("Should Bonsoir at Sunday 21h")
        void shouldBonsoirAtSunday21H() {
            FakeCalendar fakeCalendar = new FakeCalendar(0, 5);
            Welcome welcome = new Welcome(fakeCalendar);
            Assertions.assertEquals("Bon week-end", welcome.getMessage());
        }

    }
}
