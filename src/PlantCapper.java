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
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
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
  private int S13373 = 1;
  private int S12783 = 1;
  private int S12732 = 1;
  private int S12905 = 1;
  private int S12803 = 1;
  private int S12791 = 1;
  private int S12823 = 1;
  private int S12811 = 1;
  private int S12964 = 1;
  private int S12913 = 1;
  private int S12972 = 1;
  private int S13046 = 1;
  private int S12980 = 1;
  private int S12974 = 1;
  private int S12988 = 1;
  private int S12996 = 1;
  private int S13004 = 1;
  private int S13012 = 1;
  private int S13020 = 1;
  private int S13028 = 1;
  private int S13036 = 1;
  private int S13044 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread13413(int [] tdone, int [] ends){
        switch(S13044){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(capNotGrip.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
          capNotGripE.setPresent();//sysj\plantCapper.sysj line: 94, column: 36
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

  public void thread13412(int [] tdone, int [] ends){
        switch(S13036){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(capGrip.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
          capGripE.setPresent();//sysj\plantCapper.sysj line: 92, column: 33
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

  public void thread13411(int [] tdone, int [] ends){
        switch(S13028){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
          clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 90, column: 39
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

  public void thread13410(int [] tdone, int [] ends){
        switch(S13020){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
          clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 88, column: 40
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

  public void thread13409(int [] tdone, int [] ends){
        switch(S13012){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
          gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 86, column: 45
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

  public void thread13408(int [] tdone, int [] ends){
        switch(S13004){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
          gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 84, column: 44
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

  public void thread13407(int [] tdone, int [] ends){
        switch(S12996){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 82, column: 24
          gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 82, column: 44
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

  public void thread13406(int [] tdone, int [] ends){
        switch(S12988){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 80, column: 24
          gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 80, column: 45
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

  public void thread13405(int [] tdone, int [] ends){
        switch(S12980){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S12974){
          case 0 : 
            S12974=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 78, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 78, column: 38
              currsigs.addElement(bottleAtPos4E);
              S12974=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S12974=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S12974=1;
            S12974=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 78, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 78, column: 38
              currsigs.addElement(bottleAtPos4E);
              S12974=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S12974=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread13404(int [] tdone, int [] ends){
        switch(S13046){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread13405(tdone,ends);
        thread13406(tdone,ends);
        thread13407(tdone,ends);
        thread13408(tdone,ends);
        thread13409(tdone,ends);
        thread13410(tdone,ends);
        thread13411(tdone,ends);
        thread13412(tdone,ends);
        thread13413(tdone,ends);
        int biggest13414 = 0;
        if(ends[9]>=biggest13414){
          biggest13414=ends[9];
        }
        if(ends[10]>=biggest13414){
          biggest13414=ends[10];
        }
        if(ends[11]>=biggest13414){
          biggest13414=ends[11];
        }
        if(ends[12]>=biggest13414){
          biggest13414=ends[12];
        }
        if(ends[13]>=biggest13414){
          biggest13414=ends[13];
        }
        if(ends[14]>=biggest13414){
          biggest13414=ends[14];
        }
        if(ends[15]>=biggest13414){
          biggest13414=ends[15];
        }
        if(ends[16]>=biggest13414){
          biggest13414=ends[16];
        }
        if(ends[17]>=biggest13414){
          biggest13414=ends[17];
        }
        if(biggest13414 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest13414 == 0){
          S13046=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread13403(int [] tdone, int [] ends){
        switch(S12972){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 73, column: 4
        currsigs.addElement(bottleAtPos4);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread13402(int [] tdone, int [] ends){
        switch(S12964){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S12913){
          case 0 : 
            if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 60, column: 21
              S12913=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampRetracted.setPresent();//sysj\plantCapper.sysj line: 61, column: 5
              currsigs.addElement(clampRetracted);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 63, column: 10
              S12913=2;
              if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 64, column: 20
                S12913=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                clampExtended.setPresent();//sysj\plantCapper.sysj line: 65, column: 5
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
            if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 64, column: 20
              S12913=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              clampExtended.setPresent();//sysj\plantCapper.sysj line: 65, column: 5
              currsigs.addElement(clampExtended);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 67, column: 10
              S12913=0;
              if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 60, column: 21
                S12913=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                clampRetracted.setPresent();//sysj\plantCapper.sysj line: 61, column: 5
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

  public void thread13400(int [] tdone, int [] ends){
        S12823=1;
    S12811=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 22
      S12811=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      capNotGrip.setPresent();//sysj\plantCapper.sysj line: 47, column: 6
      currsigs.addElement(capNotGrip);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread13399(int [] tdone, int [] ends){
        S12803=1;
    S12791=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 35, column: 22
      S12791=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 36, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread13397(int [] tdone, int [] ends){
        switch(S12823){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S12811){
          case 0 : 
            if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 22
              S12811=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capNotGrip.setPresent();//sysj\plantCapper.sysj line: 47, column: 6
              currsigs.addElement(capNotGrip);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 49, column: 11
              S12811=2;
              if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 50, column: 21
                S12811=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                capGrip.setPresent();//sysj\plantCapper.sysj line: 51, column: 6
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
            if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 50, column: 21
              S12811=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capGrip.setPresent();//sysj\plantCapper.sysj line: 51, column: 6
              currsigs.addElement(capGrip);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 53, column: 11
              S12823=0;
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

  public void thread13396(int [] tdone, int [] ends){
        switch(S12803){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S12791){
          case 0 : 
            if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 35, column: 22
              S12791=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 36, column: 6
              currsigs.addElement(gripperTurnHomePos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 38, column: 11
              S12791=2;
              if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 39, column: 21
                S12791=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 40, column: 6
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
            if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 39, column: 21
              S12791=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 40, column: 6
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 42, column: 11
              S12803=0;
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

  public void thread13395(int [] tdone, int [] ends){
        switch(S12905){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread13396(tdone,ends);
        thread13397(tdone,ends);
        int biggest13398 = 0;
        if(ends[4]>=biggest13398){
          biggest13398=ends[4];
        }
        if(ends[5]>=biggest13398){
          biggest13398=ends[5];
        }
        if(biggest13398 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest13398 == 0){
          thread13399(tdone,ends);
          thread13400(tdone,ends);
          int biggest13401 = 0;
          if(ends[4]>=biggest13401){
            biggest13401=ends[4];
          }
          if(ends[5]>=biggest13401){
            biggest13401=ends[5];
          }
          if(biggest13401 == 1){
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        break;
      
    }
  }

  public void thread13394(int [] tdone, int [] ends){
        switch(S12783){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S12732){
          case 0 : 
            if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 21, column: 21
              S12732=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 22, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 24, column: 10
              S12732=2;
              if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 25, column: 20
                S12732=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 26, column: 5
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
            if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 25, column: 20
              S12732=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 26, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 28, column: 10
              S12732=0;
              if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 21, column: 21
                S12732=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 22, column: 5
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

  public void thread13391(int [] tdone, int [] ends){
        S13044=1;
    if(capNotGrip.getprestatus()){//sysj\plantCapper.sysj line: 94, column: 24
      capNotGripE.setPresent();//sysj\plantCapper.sysj line: 94, column: 36
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

  public void thread13390(int [] tdone, int [] ends){
        S13036=1;
    if(capGrip.getprestatus()){//sysj\plantCapper.sysj line: 92, column: 24
      capGripE.setPresent();//sysj\plantCapper.sysj line: 92, column: 33
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

  public void thread13389(int [] tdone, int [] ends){
        S13028=1;
    if(clampExtended.getprestatus()){//sysj\plantCapper.sysj line: 90, column: 24
      clampExtendedE.setPresent();//sysj\plantCapper.sysj line: 90, column: 39
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

  public void thread13388(int [] tdone, int [] ends){
        S13020=1;
    if(clampRetracted.getprestatus()){//sysj\plantCapper.sysj line: 88, column: 24
      clampRetractedE.setPresent();//sysj\plantCapper.sysj line: 88, column: 40
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

  public void thread13387(int [] tdone, int [] ends){
        S13012=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 86, column: 24
      gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 86, column: 45
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

  public void thread13386(int [] tdone, int [] ends){
        S13004=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 84, column: 24
      gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 84, column: 44
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

  public void thread13385(int [] tdone, int [] ends){
        S12996=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 82, column: 24
      gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 82, column: 44
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

  public void thread13384(int [] tdone, int [] ends){
        S12988=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 80, column: 24
      gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 80, column: 45
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

  public void thread13383(int [] tdone, int [] ends){
        S12980=1;
    S12974=0;
    if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 78, column: 24
      bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 78, column: 38
      currsigs.addElement(bottleAtPos4E);
      S12974=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S12974=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread13382(int [] tdone, int [] ends){
        S13046=1;
    thread13383(tdone,ends);
    thread13384(tdone,ends);
    thread13385(tdone,ends);
    thread13386(tdone,ends);
    thread13387(tdone,ends);
    thread13388(tdone,ends);
    thread13389(tdone,ends);
    thread13390(tdone,ends);
    thread13391(tdone,ends);
    int biggest13392 = 0;
    if(ends[9]>=biggest13392){
      biggest13392=ends[9];
    }
    if(ends[10]>=biggest13392){
      biggest13392=ends[10];
    }
    if(ends[11]>=biggest13392){
      biggest13392=ends[11];
    }
    if(ends[12]>=biggest13392){
      biggest13392=ends[12];
    }
    if(ends[13]>=biggest13392){
      biggest13392=ends[13];
    }
    if(ends[14]>=biggest13392){
      biggest13392=ends[14];
    }
    if(ends[15]>=biggest13392){
      biggest13392=ends[15];
    }
    if(ends[16]>=biggest13392){
      biggest13392=ends[16];
    }
    if(ends[17]>=biggest13392){
      biggest13392=ends[17];
    }
    if(biggest13392 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread13381(int [] tdone, int [] ends){
        S12972=1;
    bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 73, column: 4
    currsigs.addElement(bottleAtPos4);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread13380(int [] tdone, int [] ends){
        S12964=1;
    S12913=0;
    if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 60, column: 21
      S12913=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      clampRetracted.setPresent();//sysj\plantCapper.sysj line: 61, column: 5
      currsigs.addElement(clampRetracted);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread13378(int [] tdone, int [] ends){
        S12823=1;
    S12811=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 22
      S12811=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      capNotGrip.setPresent();//sysj\plantCapper.sysj line: 47, column: 6
      currsigs.addElement(capNotGrip);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread13377(int [] tdone, int [] ends){
        S12803=1;
    S12791=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 35, column: 22
      S12791=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 36, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread13376(int [] tdone, int [] ends){
        S12905=1;
    thread13377(tdone,ends);
    thread13378(tdone,ends);
    int biggest13379 = 0;
    if(ends[4]>=biggest13379){
      biggest13379=ends[4];
    }
    if(ends[5]>=biggest13379){
      biggest13379=ends[5];
    }
    if(biggest13379 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread13375(int [] tdone, int [] ends){
        S12783=1;
    S12732=0;
    if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 21, column: 21
      S12732=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 22, column: 5
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
      switch(S13373){
        case 0 : 
          S13373=0;
          break RUN;
        
        case 1 : 
          S13373=2;
          S13373=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantCapper.sysj line: 8, column: 1
            public void run() {//sysj\plantCapper.sysj line: 11, column: 21
              org.compsys704.Capper.main(null);//sysj\plantCapper.sysj line: 12, column: 4
            }
            GUI(){//sysj\plantCapper.sysj line: 10, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantCapper.sysj line: 15, column: 2
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          thread13375(tdone,ends);
          thread13376(tdone,ends);
          thread13380(tdone,ends);
          thread13381(tdone,ends);
          thread13382(tdone,ends);
          int biggest13393 = 0;
          if(ends[2]>=biggest13393){
            biggest13393=ends[2];
          }
          if(ends[3]>=biggest13393){
            biggest13393=ends[3];
          }
          if(ends[6]>=biggest13393){
            biggest13393=ends[6];
          }
          if(ends[7]>=biggest13393){
            biggest13393=ends[7];
          }
          if(ends[8]>=biggest13393){
            biggest13393=ends[8];
          }
          if(biggest13393 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 18, column: 2
          thread13394(tdone,ends);
          thread13395(tdone,ends);
          thread13402(tdone,ends);
          thread13403(tdone,ends);
          thread13404(tdone,ends);
          int biggest13415 = 0;
          if(ends[2]>=biggest13415){
            biggest13415=ends[2];
          }
          if(ends[3]>=biggest13415){
            biggest13415=ends[3];
          }
          if(ends[6]>=biggest13415){
            biggest13415=ends[6];
          }
          if(ends[7]>=biggest13415){
            biggest13415=ends[7];
          }
          if(ends[8]>=biggest13415){
            biggest13415=ends[8];
          }
          if(biggest13415 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest13415 == 0){
            S13373=0;
            active[1]=0;
            ends[1]=0;
            S13373=0;
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
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      enable.setpreclear();
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
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
