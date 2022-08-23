package com.cydeo.java12;

class Guest { // Try without teeing and check with teeing
  private String name;
  private boolean participating;// will attend or not
  private Integer participantsNumber;// how many come with you

  public Guest(String name, boolean participating,
   Integer participantsNumber) {
    this.name = name;
    this.participating = participating;
    this.participantsNumber = participantsNumber;
  }

  public String getName() {
    return name;
  }

  public boolean isParticipating() {
    return participating;
  }

  public Integer getParticipantsNumber() {
    return participantsNumber;
  }
}