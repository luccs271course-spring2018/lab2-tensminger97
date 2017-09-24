package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // //  makeListFixture
  ArrayList <Team> makeListFixture(final int size){
    final ArrayList<Team> list = new ArrayList<Team>(size);
    for(int i = 0; i < size; i++){
      final String s = Integer.toString(i);
      list.set(i, new Team("Team " + s, "Coach " + s, i * 100 +50));
    }
    return list;
  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // TODO: testFindPositionList0, 10s, 10f
  @Test 
  public void testFindPositionList0(){
    final ArrayList <Team> list = makeListFixture(0);
    assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());
  }
  // @Test 
  // public void testFindPositionList10s(){
  //   final ArrayList <Team> list = makeListFixture(10);
  //   assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
  // }
  @Test 
  public void testFindPositionList10f(){
    final ArrayList <Team> list = makeListFixture(0);
    assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
  }
  // TODO: testFindMinFundingArray for several sizes and scenarios

  // TODO: testFindMinFundingArrayFast for several sizes and scenarios
}
