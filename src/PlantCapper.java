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
  private int S12428 = 1;
  private int S11724 = 1;
  private int S11673 = 1;
  private int S11846 = 1;
  private int S11744 = 1;
  private int S11732 = 1;
  private int S11764 = 1;
  private int S11752 = 1;
  private int S11905 = 1;
  private int S11854 = 1;
  private int S11970 = 1;
  private int S11923 = 1;
  private int S12044 = 1;
  private int S11978 = 1;
  private int S11972 = 1;
  private int S11986 = 1;
  private int S11994 = 1;
  private int S12002 = 1;
  private int S12010 = 1;
  private int S12018 = 1;
  private int S12026 = 1;
  private int S12034 = 1;
  private int S12042 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread12468(int [] tdone, int [] ends){
        switch(S12042){
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

  public void thread12467(int [] tdone, int [] ends){
        switch(S12034){
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

  public void thread12466(int [] tdone, int [] ends){
        switch(S12026){
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

  public void thread12465(int [] tdone, int [] ends){
        switch(S12018){
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

  public void thread12464(int [] tdone, int [] ends){
        switch(S12010){
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

  public void thread12463(int [] tdone, int [] ends){
        switch(S12002){
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

  public void thread12462(int [] tdone, int [] ends){
        switch(S11994){
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

  public void thread12461(int [] tdone, int [] ends){
        switch(S11986){
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

  public void thread12460(int [] tdone, int [] ends){
        switch(S11978){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S11972){
          case 0 : 
            S11972=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 84, column: 38
              currsigs.addElement(bottleAtPos4E);
              S11972=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S11972=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S11972=1;
            S11972=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 84, column: 38
              currsigs.addElement(bottleAtPos4E);
              S11972=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S11972=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread12459(int [] tdone, int [] ends){
        switch(S12044){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread12460(tdone,ends);
        thread12461(tdone,ends);
        thread12462(tdone,ends);
        thread12463(tdone,ends);
        thread12464(tdone,ends);
        thread12465(tdone,ends);
        thread12466(tdone,ends);
        thread12467(tdone,ends);
        thread12468(tdone,ends);
        int biggest12469 = 0;
        if(ends[9]>=biggest12469){
          biggest12469=ends[9];
        }
        if(ends[10]>=biggest12469){
          biggest12469=ends[10];
        }
        if(ends[11]>=biggest12469){
          biggest12469=ends[11];
        }
        if(ends[12]>=biggest12469){
          biggest12469=ends[12];
        }
        if(ends[13]>=biggest12469){
          biggest12469=ends[13];
        }
        if(ends[14]>=biggest12469){
          biggest12469=ends[14];
        }
        if(ends[15]>=biggest12469){
          biggest12469=ends[15];
        }
        if(ends[16]>=biggest12469){
          biggest12469=ends[16];
        }
        if(ends[17]>=biggest12469){
          biggest12469=ends[17];
        }
        if(biggest12469 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest12469 == 0){
          S12044=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread12458(int [] tdone, int [] ends){
        switch(S11970){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S11923){
          case 0 : 
            if(enableCapper.getprestatus()){//sysj\plantCapper.sysj line: 74, column: 11
              S11923=1;
              if((!enableCapper.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 75, column: 21
                S11923=2;
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
              S11923=2;
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
              S11923=0;
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

  public void thread12457(int [] tdone, int [] ends){
        switch(S11905){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S11854){
          case 0 : 
            if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 61, column: 21
              S11854=1;
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
              S11854=2;
              if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 65, column: 20
                S11854=3;
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
              S11854=3;
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
              S11854=0;
              if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 61, column: 21
                S11854=1;
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

  public void thread12455(int [] tdone, int [] ends){
        S11764=1;
    S11752=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 47, column: 22
      S11752=1;
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

  public void thread12454(int [] tdone, int [] ends){
        S11744=1;
    S11732=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 36, column: 22
      S11732=1;
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

  public void thread12452(int [] tdone, int [] ends){
        switch(S11764){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S11752){
          case 0 : 
            if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 47, column: 22
              S11752=1;
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
              S11752=2;
              if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 51, column: 21
                S11752=3;
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
              S11752=3;
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
              S11764=0;
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

  public void thread12451(int [] tdone, int [] ends){
        switch(S11744){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S11732){
          case 0 : 
            if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 36, column: 22
              S11732=1;
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
              S11732=2;
              if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 40, column: 21
                S11732=3;
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
              S11732=3;
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
              S11744=0;
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

  public void thread12450(int [] tdone, int [] ends){
        switch(S11846){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread12451(tdone,ends);
        thread12452(tdone,ends);
        int biggest12453 = 0;
        if(ends[4]>=biggest12453){
          biggest12453=ends[4];
        }
        if(ends[5]>=biggest12453){
          biggest12453=ends[5];
        }
        if(biggest12453 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest12453 == 0){
          thread12454(tdone,ends);
          thread12455(tdone,ends);
          int biggest12456 = 0;
          if(ends[4]>=biggest12456){
            biggest12456=ends[4];
          }
          if(ends[5]>=biggest12456){
            biggest12456=ends[5];
          }
          if(biggest12456 == 1){
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        break;
      
    }
  }

  public void thread12449(int [] tdone, int [] ends){
        switch(S11724){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S11673){
          case 0 : 
            if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 22, column: 21
              S11673=1;
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
              S11673=2;
              if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 26, column: 20
                S11673=3;
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
              S11673=3;
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
              S11673=0;
              if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 22, column: 21
                S11673=1;
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

  public void thread12446(int [] tdone, int [] ends){
        S12042=1;
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

  public void thread12445(int [] tdone, int [] ends){
        S12034=1;
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

  public void thread12444(int [] tdone, int [] ends){
        S12026=1;
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

  public void thread12443(int [] tdone, int [] ends){
        S12018=1;
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

  public void thread12442(int [] tdone, int [] ends){
        S12010=1;
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

  public void thread12441(int [] tdone, int [] ends){
        S12002=1;
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

  public void thread12440(int [] tdone, int [] ends){
        S11994=1;
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

  public void thread12439(int [] tdone, int [] ends){
        S11986=1;
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

  public void thread12438(int [] tdone, int [] ends){
        S11978=1;
    S11972=0;
    if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
      bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 84, column: 38
      currsigs.addElement(bottleAtPos4E);
      S11972=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S11972=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread12437(int [] tdone, int [] ends){
        S12044=1;
    thread12438(tdone,ends);
    thread12439(tdone,ends);
    thread12440(tdone,ends);
    thread12441(tdone,ends);
    thread12442(tdone,ends);
    thread12443(tdone,ends);
    thread12444(tdone,ends);
    thread12445(tdone,ends);
    thread12446(tdone,ends);
    int biggest12447 = 0;
    if(ends[9]>=biggest12447){
      biggest12447=ends[9];
    }
    if(ends[10]>=biggest12447){
      biggest12447=ends[10];
    }
    if(ends[11]>=biggest12447){
      biggest12447=ends[11];
    }
    if(ends[12]>=biggest12447){
      biggest12447=ends[12];
    }
    if(ends[13]>=biggest12447){
      biggest12447=ends[13];
    }
    if(ends[14]>=biggest12447){
      biggest12447=ends[14];
    }
    if(ends[15]>=biggest12447){
      biggest12447=ends[15];
    }
    if(ends[16]>=biggest12447){
      biggest12447=ends[16];
    }
    if(ends[17]>=biggest12447){
      biggest12447=ends[17];
    }
    if(biggest12447 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread12436(int [] tdone, int [] ends){
        S11970=1;
    S11923=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread12435(int [] tdone, int [] ends){
        S11905=1;
    S11854=0;
    if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 61, column: 21
      S11854=1;
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

  public void thread12433(int [] tdone, int [] ends){
        S11764=1;
    S11752=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 47, column: 22
      S11752=1;
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

  public void thread12432(int [] tdone, int [] ends){
        S11744=1;
    S11732=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 36, column: 22
      S11732=1;
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

  public void thread12431(int [] tdone, int [] ends){
        S11846=1;
    thread12432(tdone,ends);
    thread12433(tdone,ends);
    int biggest12434 = 0;
    if(ends[4]>=biggest12434){
      biggest12434=ends[4];
    }
    if(ends[5]>=biggest12434){
      biggest12434=ends[5];
    }
    if(biggest12434 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread12430(int [] tdone, int [] ends){
        S11724=1;
    S11673=0;
    if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 22, column: 21
      S11673=1;
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
      switch(S12428){
        case 0 : 
          S12428=0;
          break RUN;
        
        case 1 : 
          S12428=2;
          S12428=2;
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
          thread12430(tdone,ends);
          thread12431(tdone,ends);
          thread12435(tdone,ends);
          thread12436(tdone,ends);
          thread12437(tdone,ends);
          int biggest12448 = 0;
          if(ends[2]>=biggest12448){
            biggest12448=ends[2];
          }
          if(ends[3]>=biggest12448){
            biggest12448=ends[3];
          }
          if(ends[6]>=biggest12448){
            biggest12448=ends[6];
          }
          if(ends[7]>=biggest12448){
            biggest12448=ends[7];
          }
          if(ends[8]>=biggest12448){
            biggest12448=ends[8];
          }
          if(biggest12448 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 19, column: 2
          thread12449(tdone,ends);
          thread12450(tdone,ends);
          thread12457(tdone,ends);
          thread12458(tdone,ends);
          thread12459(tdone,ends);
          int biggest12470 = 0;
          if(ends[2]>=biggest12470){
            biggest12470=ends[2];
          }
          if(ends[3]>=biggest12470){
            biggest12470=ends[3];
          }
          if(ends[6]>=biggest12470){
            biggest12470=ends[6];
          }
          if(ends[7]>=biggest12470){
            biggest12470=ends[7];
          }
          if(ends[8]>=biggest12470){
            biggest12470=ends[8];
          }
          if(biggest12470 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest12470 == 0){
            S12428=0;
            active[1]=0;
            ends[1]=0;
            S12428=0;
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
