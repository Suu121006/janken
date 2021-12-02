package oit.is.z1260.kaizi.janken.model;

import java.util.Random;

public class Janken {
  String name;
  int cpHand;
  int userHand;
  int userScore;

  public void jankenPon(int userHand) {
    Random rand = new Random();
    this.userHand = userHand;
    cpHand = rand.nextInt(3);
    if (userHand - cpHand == 0) {
      userScore = 1;
    } else if (userHand - cpHand == 2 || userHand - cpHand == -1) {
      userScore = 2;
    } else {
      userScore = 0;
    }
  }

  public String convertHand(int hand) {
    switch (hand) {
      case 0: {
        return "Gu";
      }
      case 1: {
        return "Choki";
      }
      case 2: {
        return "Pa";
      }
      default: {
        return "error";
      }
    }
  }

  public String convertScore(int score) {
    switch (score) {
      case 0: {
        return "You lose";
      }
      case 1: {
        return "Draw";
      }
      case 2: {
        return "You win";
      }
      default: {
        return "error";
      }
    }
  }

  // getter/setter

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCpHand() {
    return cpHand;
  }

  public void setCpHand(int cpHand) {
    this.cpHand = cpHand;
  }

  public int getUserHand() {
    return userHand;
  }

  public void setUserHand(int userHand) {
    this.userHand = userHand;
  }

  public int getUserScore() {
    return userScore;
  }

  public void setUserScore(int userScore) {
    this.userScore = userScore;
  }

}
