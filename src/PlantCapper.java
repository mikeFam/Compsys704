import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantCapper extends ClockDomain{
  public PlantCapper(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal jobDone = new Signal("jobDone", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal enableCapper = new Signal("enableCapper", Signal.INPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  public Signal clampRetracted = new Signal("clampRetracted", Signal.OUTPUT);
  public Signal clampExtended = new Signal("clampExtended", Signal.OUTPUT);
  public Signal capGrip = new Signal("capGrip", Signal.OUTPUT);
  public Signal capNotGrip = new Signal("capNotGrip", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  public Signal clampRetractedE = new Signal("clampRetractedE", Signal.OUTPUT);
  public Signal clampExtendedE = new Signal("clampExtendedE", Signal.OUTPUT);
  public Signal capGripE = new Signal("capGripE", Signal.OUTPUT);
  public Signal capNotGripE = new Signal("capNotGripE", Signal.OUTPUT);
  private Signal bottleClamp_1;
  private Signal bottleNotClamp_1;
  private int S13185 = 1;
  private int S12481 = 1;
  private int S12430 = 1;
  private int S12603 = 1;
  private int S12501 = 1;
  private int S12489 = 1;
  private int S12521 = 1;
  private int S12509 = 1;
  private int S12662 = 1;
  private int S12611 = 1;
  private int S12727 = 1;
  private int S12680 = 1;
  private int S12801 = 1;
  private int S12735 = 1;
  private int S12729 = 1;
  private int S12743 = 1;
  private int S12751 = 1;
  private int S12759 = 1;
  private int S12767 = 1;
  private int S12775 = 1;
  private int S12783 = 1;
  private int S12791 = 1;
  private int S12799 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread13225(int [] tdone, int [] ends){
        switch(S12799){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(capNotGrip.getprestatus()){//sysj\plantCapper.sysj line: 100, column: 24
          capNotGripE.setPresent();//sysj\plantCapper.sysj line: 100, column: 36
          currsigs.addElement(capNotGripE);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread13224(int [] tdone, int [] ends){
        switch(S12791){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(capGrip.getprestatus()){//sysj\plantCapper.sysj line: 98, column: 24
          capGripE.setPresent();//sysj\plantCapper.sysj line: 98, column: 33
          currsigs.addElement(capGripE);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread13223(int [] tdone, int [] ends){
        switch(S12783){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 96, column: 24
          clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 96, column: 39
          currsigs.addElement(clampExtendedE);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread13222(int [] tdone, int [] ends){
        switch(S12775){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
          clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 94, column: 40
          currsigs.addElement(clampRetractedE);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread13221(int [] tdone, int [] ends){
        switch(S12767){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
          gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 92, column: 45
          currsigs.addElement(gripperTurnFinalPosE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread13220(int [] tdone, int [] ends){
        switch(S12759){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
          gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 90, column: 44
          currsigs.addElement(gripperTurnHomePosE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread13219(int [] tdone, int [] ends){
        switch(S12751){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
          gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 88, column: 44
          currsigs.addElement(gripperZAxisLiftedE);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread13218(int [] tdone, int [] ends){
        switch(S12743){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
          gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 86, column: 45
          currsigs.addElement(gripperZAxisLoweredE);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread13217(int [] tdone, int [] ends){
        switch(S12735){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S12729){
          case 0 : 
            S12729=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 84, column: 38
              currsigs.addElement(bottleAtPos4E);
              S12729=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S12729=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S12729=1;
            S12729=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 84, column: 38
              currsigs.addElement(bottleAtPos4E);
              S12729=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S12729=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13216(int [] tdone, int [] ends){
        switch(S12801){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread13217(tdone,ends);
        thread13218(tdone,ends);
        thread13219(tdone,ends);
        thread13220(tdone,ends);
        thread13221(tdone,ends);
        thread13222(tdone,ends);
        thread13223(tdone,ends);
        thread13224(tdone,ends);
        thread13225(tdone,ends);
        int biggest13226 = 0;
        if(ends[9]>=biggest13226){
          biggest13226=ends[9];
        }
        if(ends[10]>=biggest13226){
          biggest13226=ends[10];
        }
        if(ends[11]>=biggest13226){
          biggest13226=ends[11];
        }
        if(ends[12]>=biggest13226){
          biggest13226=ends[12];
        }
        if(ends[13]>=biggest13226){
          biggest13226=ends[13];
        }
        if(ends[14]>=biggest13226){
          biggest13226=ends[14];
        }
        if(ends[15]>=biggest13226){
          biggest13226=ends[15];
        }
        if(ends[16]>=biggest13226){
          biggest13226=ends[16];
        }
        if(ends[17]>=biggest13226){
          biggest13226=ends[17];
        }
        if(biggest13226 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest13226 == 0){
          S12801=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread13215(int [] tdone, int [] ends){
        switch(S12727){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S12680){
          case 0 : 
            if(enableCapper.getprestatus()){//sysj\plantCapper.sysj line: 74, column: 11
              S12680=1;
              if((!enableCapper.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 75, column: 21
                S12680=2;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                System.out.println("enableCapper");//sysj\plantCapper.sysj line: 76, column: 5
                bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 77, column: 5
                currsigs.addElement(bottleAtPos4);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if((!enableCapper.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 75, column: 21
              S12680=2;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 77, column: 5
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 79, column: 9
              S12680=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13214(int [] tdone, int [] ends){
        switch(S12662){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S12611){
          case 0 : 
            if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 61, column: 21
              S12611=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampRetracted.setPresent();//sysj\plantCapper.sysj line: 62, column: 5
              currsigs.addElement(clampRetracted);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 64, column: 10
              S12611=2;
              if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 65, column: 20
                S12611=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                clampExtended.setPresent();//sysj\plantCapper.sysj line: 66, column: 5
                currsigs.addElement(clampExtended);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 65, column: 20
              S12611=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampExtended.setPresent();//sysj\plantCapper.sysj line: 66, column: 5
              currsigs.addElement(clampExtended);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 68, column: 10
              S12611=0;
              if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 61, column: 21
                S12611=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                clampRetracted.setPresent();//sysj\plantCapper.sysj line: 62, column: 5
                currsigs.addElement(clampRetracted);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13212(int [] tdone, int [] ends){
        S12521=1;
    S12509=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 47, column: 22
      S12509=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      capNotGrip.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
      currsigs.addElement(capNotGrip);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread13211(int [] tdone, int [] ends){
        S12501=1;
    S12489=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 36, column: 22
      S12489=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 37, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread13209(int [] tdone, int [] ends){
        switch(S12521){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S12509){
          case 0 : 
            if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 47, column: 22
              S12509=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capNotGrip.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
              currsigs.addElement(capNotGrip);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 50, column: 11
              S12509=2;
              if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 51, column: 21
                S12509=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                capGrip.setPresent();//sysj\plantCapper.sysj line: 52, column: 6
                currsigs.addElement(capGrip);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 51, column: 21
              S12509=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capGrip.setPresent();//sysj\plantCapper.sysj line: 52, column: 6
              currsigs.addElement(capGrip);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 54, column: 11
              S12521=0;
              active[5]=0;
              ends[5]=0;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13208(int [] tdone, int [] ends){
        switch(S12501){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S12489){
          case 0 : 
            if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 36, column: 22
              S12489=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 37, column: 6
              currsigs.addElement(gripperTurnHomePos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 39, column: 11
              S12489=2;
              if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 40, column: 21
                S12489=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 41, column: 6
                currsigs.addElement(gripperTurnFinalPos);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 40, column: 21
              S12489=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 41, column: 6
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 43, column: 11
              S12501=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13207(int [] tdone, int [] ends){
        switch(S12603){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread13208(tdone,ends);
        thread13209(tdone,ends);
        int biggest13210 = 0;
        if(ends[4]>=biggest13210){
          biggest13210=ends[4];
        }
        if(ends[5]>=biggest13210){
          biggest13210=ends[5];
        }
        if(biggest13210 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest13210 == 0){
          thread13211(tdone,ends);
          thread13212(tdone,ends);
          int biggest13213 = 0;
          if(ends[4]>=biggest13213){
            biggest13213=ends[4];
          }
          if(ends[5]>=biggest13213){
            biggest13213=ends[5];
          }
          if(biggest13213 == 1){
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        break;
      
    }
  }

  public void thread13206(int [] tdone, int [] ends){
        switch(S12481){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S12430){
          case 0 : 
            if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 22, column: 21
              S12430=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 23, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 25, column: 10
              S12430=2;
              if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 26, column: 20
                S12430=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 27, column: 5
                currsigs.addElement(gripperZAxisLowered);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 26, column: 20
              S12430=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 27, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 29, column: 10
              S12430=0;
              if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 22, column: 21
                S12430=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 23, column: 5
                currsigs.addElement(gripperZAxisLifted);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13203(int [] tdone, int [] ends){
        S12799=1;
    if(capNotGrip.getprestatus()){//sysj\plantCapper.sysj line: 100, column: 24
      capNotGripE.setPresent();//sysj\plantCapper.sysj line: 100, column: 36
      currsigs.addElement(capNotGripE);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread13202(int [] tdone, int [] ends){
        S12791=1;
    if(capGrip.getprestatus()){//sysj\plantCapper.sysj line: 98, column: 24
      capGripE.setPresent();//sysj\plantCapper.sysj line: 98, column: 33
      currsigs.addElement(capGripE);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread13201(int [] tdone, int [] ends){
        S12783=1;
    if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 96, column: 24
      clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 96, column: 39
      currsigs.addElement(clampExtendedE);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread13200(int [] tdone, int [] ends){
        S12775=1;
    if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
      clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 94, column: 40
      currsigs.addElement(clampRetractedE);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread13199(int [] tdone, int [] ends){
        S12767=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
      gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 92, column: 45
      currsigs.addElement(gripperTurnFinalPosE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread13198(int [] tdone, int [] ends){
        S12759=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
      gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 90, column: 44
      currsigs.addElement(gripperTurnHomePosE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread13197(int [] tdone, int [] ends){
        S12751=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
      gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 88, column: 44
      currsigs.addElement(gripperZAxisLiftedE);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread13196(int [] tdone, int [] ends){
        S12743=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
      gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 86, column: 45
      currsigs.addElement(gripperZAxisLoweredE);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread13195(int [] tdone, int [] ends){
        S12735=1;
    S12729=0;
    if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
      bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 84, column: 38
      currsigs.addElement(bottleAtPos4E);
      S12729=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S12729=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread13194(int [] tdone, int [] ends){
        S12801=1;
    thread13195(tdone,ends);
    thread13196(tdone,ends);
    thread13197(tdone,ends);
    thread13198(tdone,ends);
    thread13199(tdone,ends);
    thread13200(tdone,ends);
    thread13201(tdone,ends);
    thread13202(tdone,ends);
    thread13203(tdone,ends);
    int biggest13204 = 0;
    if(ends[9]>=biggest13204){
      biggest13204=ends[9];
    }
    if(ends[10]>=biggest13204){
      biggest13204=ends[10];
    }
    if(ends[11]>=biggest13204){
      biggest13204=ends[11];
    }
    if(ends[12]>=biggest13204){
      biggest13204=ends[12];
    }
    if(ends[13]>=biggest13204){
      biggest13204=ends[13];
    }
    if(ends[14]>=biggest13204){
      biggest13204=ends[14];
    }
    if(ends[15]>=biggest13204){
      biggest13204=ends[15];
    }
    if(ends[16]>=biggest13204){
      biggest13204=ends[16];
    }
    if(ends[17]>=biggest13204){
      biggest13204=ends[17];
    }
    if(biggest13204 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread13193(int [] tdone, int [] ends){
        S12727=1;
    S12680=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread13192(int [] tdone, int [] ends){
        S12662=1;
    S12611=0;
    if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 61, column: 21
      S12611=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      clampRetracted.setPresent();//sysj\plantCapper.sysj line: 62, column: 5
      currsigs.addElement(clampRetracted);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread13190(int [] tdone, int [] ends){
        S12521=1;
    S12509=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 47, column: 22
      S12509=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      capNotGrip.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
      currsigs.addElement(capNotGrip);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread13189(int [] tdone, int [] ends){
        S12501=1;
    S12489=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 36, column: 22
      S12489=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 37, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread13188(int [] tdone, int [] ends){
        S12603=1;
    thread13189(tdone,ends);
    thread13190(tdone,ends);
    int biggest13191 = 0;
    if(ends[4]>=biggest13191){
      biggest13191=ends[4];
    }
    if(ends[5]>=biggest13191){
      biggest13191=ends[5];
    }
    if(biggest13191 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread13187(int [] tdone, int [] ends){
        S12481=1;
    S12430=0;
    if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 22, column: 21
      S12430=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 23, column: 5
      currsigs.addElement(gripperZAxisLifted);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S13185){
        case 0 : 
          S13185=0;
          break RUN;
        
        case 1 : 
          S13185=2;
          S13185=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantCapper.sysj line: 9, column: 1
            public void run() {//sysj\plantCapper.sysj line: 12, column: 21
              org.compsys704.Capper.main(null);//sysj\plantCapper.sysj line: 13, column: 4
            }
            GUI(){//sysj\plantCapper.sysj line: 11, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantCapper.sysj line: 16, column: 2
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          thread13187(tdone,ends);
          thread13188(tdone,ends);
          thread13192(tdone,ends);
          thread13193(tdone,ends);
          thread13194(tdone,ends);
          int biggest13205 = 0;
          if(ends[2]>=biggest13205){
            biggest13205=ends[2];
          }
          if(ends[3]>=biggest13205){
            biggest13205=ends[3];
          }
          if(ends[6]>=biggest13205){
            biggest13205=ends[6];
          }
          if(ends[7]>=biggest13205){
            biggest13205=ends[7];
          }
          if(ends[8]>=biggest13205){
            biggest13205=ends[8];
          }
          if(biggest13205 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          thread13206(tdone,ends);
          thread13207(tdone,ends);
          thread13214(tdone,ends);
          thread13215(tdone,ends);
          thread13216(tdone,ends);
          int biggest13227 = 0;
          if(ends[2]>=biggest13227){
            biggest13227=ends[2];
          }
          if(ends[3]>=biggest13227){
            biggest13227=ends[3];
          }
          if(ends[6]>=biggest13227){
            biggest13227=ends[6];
          }
          if(ends[7]>=biggest13227){
            biggest13227=ends[7];
          }
          if(ends[8]>=biggest13227){
            biggest13227=ends[8];
          }
          if(biggest13227 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest13227 == 0){
            S13185=0;
            active[1]=0;
            ends[1]=0;
            S13185=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleClamp_1 = new Signal();
    bottleNotClamp_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          jobDone.gethook();
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          enable.gethook();
          enableCapper.gethook();
          df = true;
        }
        runClockDomain();
      }
      jobDone.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      enable.setpreclear();
      enableCapper.setpreclear();
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      clampRetracted.setpreclear();
      clampExtended.setpreclear();
      capGrip.setpreclear();
      capNotGrip.setpreclear();
      bottleAtPos4E.setpreclear();
      gripperZAxisLoweredE.setpreclear();
      gripperZAxisLiftedE.setpreclear();
      gripperTurnHomePosE.setpreclear();
      gripperTurnFinalPosE.setpreclear();
      clampRetractedE.setpreclear();
      clampExtendedE.setpreclear();
      capGripE.setpreclear();
      capNotGripE.setpreclear();
      bottleClamp_1.setpreclear();
      bottleNotClamp_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = jobDone.getStatus() ? jobDone.setprepresent() : jobDone.setpreclear();
      jobDone.setpreval(jobDone.getValue());
      jobDone.setClear();
      dummyint = cylPos5ZaxisExtend.getStatus() ? cylPos5ZaxisExtend.setprepresent() : cylPos5ZaxisExtend.setpreclear();
      cylPos5ZaxisExtend.setpreval(cylPos5ZaxisExtend.getValue());
      cylPos5ZaxisExtend.setClear();
      dummyint = gripperTurnRetract.getStatus() ? gripperTurnRetract.setprepresent() : gripperTurnRetract.setpreclear();
      gripperTurnRetract.setpreval(gripperTurnRetract.getValue());
      gripperTurnRetract.setClear();
      dummyint = gripperTurnExtend.getStatus() ? gripperTurnExtend.setprepresent() : gripperTurnExtend.setpreclear();
      gripperTurnExtend.setpreval(gripperTurnExtend.getValue());
      gripperTurnExtend.setClear();
      dummyint = capGripperPos5Extend.getStatus() ? capGripperPos5Extend.setprepresent() : capGripperPos5Extend.setpreclear();
      capGripperPos5Extend.setpreval(capGripperPos5Extend.getValue());
      capGripperPos5Extend.setClear();
      dummyint = cylClampBottleExtend.getStatus() ? cylClampBottleExtend.setprepresent() : cylClampBottleExtend.setpreclear();
      cylClampBottleExtend.setpreval(cylClampBottleExtend.getValue());
      cylClampBottleExtend.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = enableCapper.getStatus() ? enableCapper.setprepresent() : enableCapper.setpreclear();
      enableCapper.setpreval(enableCapper.getValue());
      enableCapper.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      gripperZAxisLowered.sethook();
      gripperZAxisLowered.setClear();
      gripperZAxisLifted.sethook();
      gripperZAxisLifted.setClear();
      gripperTurnHomePos.sethook();
      gripperTurnHomePos.setClear();
      gripperTurnFinalPos.sethook();
      gripperTurnFinalPos.setClear();
      clampRetracted.sethook();
      clampRetracted.setClear();
      clampExtended.sethook();
      clampExtended.setClear();
      capGrip.sethook();
      capGrip.setClear();
      capNotGrip.sethook();
      capNotGrip.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      gripperZAxisLoweredE.sethook();
      gripperZAxisLoweredE.setClear();
      gripperZAxisLiftedE.sethook();
      gripperZAxisLiftedE.setClear();
      gripperTurnHomePosE.sethook();
      gripperTurnHomePosE.setClear();
      gripperTurnFinalPosE.sethook();
      gripperTurnFinalPosE.setClear();
      clampRetractedE.sethook();
      clampRetractedE.setClear();
      clampExtendedE.sethook();
      clampExtendedE.setClear();
      capGripE.sethook();
      capGripE.setClear();
      capNotGripE.sethook();
      capNotGripE.setClear();
      bottleClamp_1.setClear();
      bottleNotClamp_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        jobDone.gethook();
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
        enable.gethook();
        enableCapper.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
