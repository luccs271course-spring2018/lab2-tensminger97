package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }
  @Test
  public void testConstructorValidFunding(){
    try{
      new Team("USA", "Klinsmann", 0);
      fail("should have thrown IllegalArgumentException");
    }catch(final Throwable ex){
      
    }
  }
  @Test
  public void testConstructorHeadCoach(){
    try{
      new Team("USA", null, 500);
      fail("should have thrown IllegalArgumentException");
    }catch(final Throwable ex){
      
    }
  }
  
  // DONE testConstructorValidHeadcoach
  // DONE testConstructorValidFunding

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }
  @Test
  public void testGetHeadcoach() {
    final String name = "Klinsmann";
    final Team t = makeTeamFixture("USA", name, 500);
    assertEquals(name, t.getHeadcoach());
  }
  @Test
  public void testGetFunding() {
    final int funding = 500;
    final Team t = makeTeamFixture("USA", "Klinsmann", funding);
    assertEquals(funding, t.getFunding());
  }
  
  // DONE testGetHeadcoach
  // Done testGetFunding
}