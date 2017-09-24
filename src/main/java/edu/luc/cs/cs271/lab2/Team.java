package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null || headcoach == null || funding == 0) {
      throw new IllegalArgumentException("there is a null null");
      
    }
    // Done validity checking for headcoach
    // Done validity checking for funding
    this.headcoach=headcoach;
    this.funding=funding;
    this.name = name;
    // Done complete this constructor
  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    // Done complete this method
    return this.headcoach;
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // Done complete this method
    return this.funding;
  }
}
