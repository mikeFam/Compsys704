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
<<<<<<< HEAD
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  private Signal bottleClamp_1;
  private Signal bottleNotClamp_1;
  private Signal capGrip_1;
  private Signal capNotGrip_1;
  private int S8293 = 1;
  private int S7952 = 1;
  private int S7869 = 1;
  private int S8146 = 1;
  private int S7984 = 1;
  private int S7964 = 1;
  private int S8016 = 1;
  private int S7996 = 1;
  private int S8241 = 1;
  private int S8158 = 1;
  private int S8249 = 1;
  private int S8291 = 1;
  private int S8257 = 1;
  private int S8251 = 1;
  private int S8265 = 1;
  private int S8273 = 1;
  private int S8281 = 1;
  private int S8289 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread8325(int [] tdone, int [] ends){
        switch(S8289){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 85, column: 24
          gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 85, column: 45
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

  public void thread8324(int [] tdone, int [] ends){
        switch(S8281){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 83, column: 24
          gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 83, column: 44
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

  public void thread8323(int [] tdone, int [] ends){
        switch(S8273){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 81, column: 24
          gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 81, column: 44
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

  public void thread8322(int [] tdone, int [] ends){
        switch(S8265){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 79, column: 24
          gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 79, column: 45
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

  public void thread8321(int [] tdone, int [] ends){
        switch(S8257){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S8251){
          case 0 : 
            S8251=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 77, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 77, column: 38
              currsigs.addElement(bottleAtPos4E);
              S8251=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S8251=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S8251=1;
            S8251=0;
            if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 77, column: 24
              bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 77, column: 38
              currsigs.addElement(bottleAtPos4E);
              S8251=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S8251=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread8320(int [] tdone, int [] ends){
        switch(S8291){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread8321(tdone,ends);
        thread8322(tdone,ends);
        thread8323(tdone,ends);
        thread8324(tdone,ends);
        thread8325(tdone,ends);
        int biggest8326 = 0;
        if(ends[9]>=biggest8326){
          biggest8326=ends[9];
        }
        if(ends[10]>=biggest8326){
          biggest8326=ends[10];
        }
        if(ends[11]>=biggest8326){
          biggest8326=ends[11];
        }
        if(ends[12]>=biggest8326){
          biggest8326=ends[12];
        }
        if(ends[13]>=biggest8326){
          biggest8326=ends[13];
        }
        if(biggest8326 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest8326 == 0){
          S8291=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread8319(int [] tdone, int [] ends){
        switch(S8249){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 72, column: 4
        currsigs.addElement(bottleAtPos4);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread8318(int [] tdone, int [] ends){
        switch(S8241){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S8158){
          case 0 : 
            if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 57, column: 21
              S8158=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleNotClamp_1.setPresent();//sysj\plantCapper.sysj line: 59, column: 5
              currsigs.addElement(bottleNotClamp_1);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 61, column: 10
              S8158=2;
              if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 62, column: 20
                S8158=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                System.out.println("bottleClamp");//sysj\plantCapper.sysj line: 63, column: 5
                bottleClamp_1.setPresent();//sysj\plantCapper.sysj line: 64, column: 5
                currsigs.addElement(bottleClamp_1);
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
            if((!cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 62, column: 20
              S8158=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleClamp_1.setPresent();//sysj\plantCapper.sysj line: 64, column: 5
              currsigs.addElement(bottleClamp_1);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 66, column: 10
              S8158=0;
              if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 57, column: 21
                S8158=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                System.out.println("bottleNotClamp");//sysj\plantCapper.sysj line: 58, column: 5
                bottleNotClamp_1.setPresent();//sysj\plantCapper.sysj line: 59, column: 5
                currsigs.addElement(bottleNotClamp_1);
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

  public void thread8316(int [] tdone, int [] ends){
        S8016=1;
    S7996=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 41, column: 22
      S7996=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      System.out.println("capNotGrip");//sysj\plantCapper.sysj line: 42, column: 6
      capNotGrip_1.setPresent();//sysj\plantCapper.sysj line: 43, column: 6
      currsigs.addElement(capNotGrip_1);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread8315(int [] tdone, int [] ends){
        S7984=1;
    S7964=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 28, column: 22
      S7964=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      System.out.println("gripperTurnHomePos");//sysj\plantCapper.sysj line: 29, column: 6
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 30, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread8313(int [] tdone, int [] ends){
        switch(S8016){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S7996){
          case 0 : 
            if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 41, column: 22
              S7996=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capNotGrip_1.setPresent();//sysj\plantCapper.sysj line: 43, column: 6
              currsigs.addElement(capNotGrip_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 45, column: 11
              S7996=2;
              if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 21
                S7996=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                System.out.println("capGrip");//sysj\plantCapper.sysj line: 47, column: 6
                capGrip_1.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
                currsigs.addElement(capGrip_1);
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
            if((!capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 46, column: 21
              S7996=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capGrip_1.setPresent();//sysj\plantCapper.sysj line: 48, column: 6
              currsigs.addElement(capGrip_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 50, column: 11
              S8016=0;
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

  public void thread8312(int [] tdone, int [] ends){
        switch(S7984){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S7964){
          case 0 : 
            if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 28, column: 22
              S7964=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 30, column: 6
              currsigs.addElement(gripperTurnHomePos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 32, column: 11
              S7964=2;
              if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 33, column: 21
                S7964=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                System.out.println("gripperTurnFinalPos");//sysj\plantCapper.sysj line: 34, column: 6
                gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 35, column: 6
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
            if((gripperTurnRetract.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 33, column: 21
              S7964=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\plantCapper.sysj line: 35, column: 6
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 37, column: 11
              S7984=0;
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

  public void thread8311(int [] tdone, int [] ends){
        switch(S8146){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread8312(tdone,ends);
        thread8313(tdone,ends);
        int biggest8314 = 0;
        if(ends[4]>=biggest8314){
          biggest8314=ends[4];
        }
        if(ends[5]>=biggest8314){
          biggest8314=ends[5];
        }
        if(biggest8314 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest8314 == 0){
          thread8315(tdone,ends);
          thread8316(tdone,ends);
          int biggest8317 = 0;
          if(ends[4]>=biggest8317){
            biggest8317=ends[4];
          }
          if(ends[5]>=biggest8317){
            biggest8317=ends[5];
          }
          if(biggest8317 == 1){
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        break;
      
    }
  }

  public void thread8310(int [] tdone, int [] ends){
        switch(S7952){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S7869){
          case 0 : 
            if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 12, column: 21
              S7869=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 14, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 16, column: 10
              S7869=2;
              if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 17, column: 20
                S7869=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("gripperZAxisLowered");//sysj\plantCapper.sysj line: 18, column: 5
                gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 19, column: 5
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
            if((!cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 17, column: 20
              S7869=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\plantCapper.sysj line: 19, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantCapper.sysj line: 21, column: 10
              S7869=0;
              if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 12, column: 21
                S7869=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("gripperZAxisLifted");//sysj\plantCapper.sysj line: 13, column: 5
                gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 14, column: 5
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

  public void thread8307(int [] tdone, int [] ends){
        S8289=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\plantCapper.sysj line: 85, column: 24
      gripperTurnFinalPosE.setPresent();//sysj\plantCapper.sysj line: 85, column: 45
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

  public void thread8306(int [] tdone, int [] ends){
        S8281=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\plantCapper.sysj line: 83, column: 24
      gripperTurnHomePosE.setPresent();//sysj\plantCapper.sysj line: 83, column: 44
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

  public void thread8305(int [] tdone, int [] ends){
        S8273=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\plantCapper.sysj line: 81, column: 24
      gripperZAxisLiftedE.setPresent();//sysj\plantCapper.sysj line: 81, column: 44
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

  public void thread8304(int [] tdone, int [] ends){
        S8265=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\plantCapper.sysj line: 79, column: 24
      gripperZAxisLoweredE.setPresent();//sysj\plantCapper.sysj line: 79, column: 45
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

  public void thread8303(int [] tdone, int [] ends){
        S8257=1;
    S8251=0;
    if(bottleAtPos4.getprestatus()){//sysj\plantCapper.sysj line: 77, column: 24
      bottleAtPos4E.setPresent();//sysj\plantCapper.sysj line: 77, column: 38
      currsigs.addElement(bottleAtPos4E);
      S8251=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S8251=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread8302(int [] tdone, int [] ends){
        S8291=1;
    thread8303(tdone,ends);
    thread8304(tdone,ends);
    thread8305(tdone,ends);
    thread8306(tdone,ends);
    thread8307(tdone,ends);
    int biggest8308 = 0;
    if(ends[9]>=biggest8308){
      biggest8308=ends[9];
    }
    if(ends[10]>=biggest8308){
      biggest8308=ends[10];
    }
    if(ends[11]>=biggest8308){
      biggest8308=ends[11];
    }
    if(ends[12]>=biggest8308){
      biggest8308=ends[12];
    }
    if(ends[13]>=biggest8308){
      biggest8308=ends[13];
    }
    if(biggest8308 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread8301(int [] tdone, int [] ends){
        S8249=1;
    bottleAtPos4.setPresent();//sysj\plantCapper.sysj line: 72, column: 4
    currsigs.addElement(bottleAtPos4);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread8300(int [] tdone, int [] ends){
        S8241=1;
    S8158=0;
    if((cylClampBottleExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 57, column: 21
      S8158=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      System.out.println("bottleNotClamp");//sysj\plantCapper.sysj line: 58, column: 5
      bottleNotClamp_1.setPresent();//sysj\plantCapper.sysj line: 59, column: 5
      currsigs.addElement(bottleNotClamp_1);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread8298(int [] tdone, int [] ends){
        S8016=1;
    S7996=0;
    if((capGripperPos5Extend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 41, column: 22
      S7996=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      System.out.println("capNotGrip");//sysj\plantCapper.sysj line: 42, column: 6
      capNotGrip_1.setPresent();//sysj\plantCapper.sysj line: 43, column: 6
      currsigs.addElement(capNotGrip_1);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread8297(int [] tdone, int [] ends){
        S7984=1;
    S7964=0;
    if((gripperTurnExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 28, column: 22
      S7964=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      System.out.println("gripperTurnHomePos");//sysj\plantCapper.sysj line: 29, column: 6
      gripperTurnHomePos.setPresent();//sysj\plantCapper.sysj line: 30, column: 6
      currsigs.addElement(gripperTurnHomePos);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread8296(int [] tdone, int [] ends){
        S8146=1;
    thread8297(tdone,ends);
    thread8298(tdone,ends);
    int biggest8299 = 0;
    if(ends[4]>=biggest8299){
      biggest8299=ends[4];
    }
    if(ends[5]>=biggest8299){
      biggest8299=ends[5];
    }
    if(biggest8299 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread8295(int [] tdone, int [] ends){
        S7952=1;
    S7869=0;
    if((cylPos5ZaxisExtend.getprestatus() && enable.getprestatus())){//sysj\plantCapper.sysj line: 12, column: 21
      S7869=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("gripperZAxisLifted");//sysj\plantCapper.sysj line: 13, column: 5
      gripperZAxisLifted.setPresent();//sysj\plantCapper.sysj line: 14, column: 5
      currsigs.addElement(gripperZAxisLifted);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

=======
  public Signal gripperZAxisLoweredM = new Signal("gripperZAxisLoweredM", Signal.OUTPUT);
  public Signal gripperZAxisLiftedM = new Signal("gripperZAxisLiftedM", Signal.OUTPUT);
  public Signal gripperTurnHomePosM = new Signal("gripperTurnHomePosM", Signal.OUTPUT);
  public Signal gripperTurnFinalPosM = new Signal("gripperTurnFinalPosM", Signal.OUTPUT);
  private int S6091 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
>>>>>>> cc5cb389511926da6b29712bab8fcfd2c16e2c2c
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
<<<<<<< HEAD
      switch(S8293){
        case 0 : 
          S8293=0;
          break RUN;
        
        case 1 : 
          S8293=2;
          S8293=2;
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          capGrip_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          capNotGrip_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          thread8295(tdone,ends);
          thread8296(tdone,ends);
          thread8300(tdone,ends);
          thread8301(tdone,ends);
          thread8302(tdone,ends);
          int biggest8309 = 0;
          if(ends[2]>=biggest8309){
            biggest8309=ends[2];
          }
          if(ends[3]>=biggest8309){
            biggest8309=ends[3];
          }
          if(ends[6]>=biggest8309){
            biggest8309=ends[6];
          }
          if(ends[7]>=biggest8309){
            biggest8309=ends[7];
          }
          if(ends[8]>=biggest8309){
            biggest8309=ends[8];
          }
          if(biggest8309 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleClamp_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          bottleNotClamp_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          capGrip_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          capNotGrip_1.setClear();//sysj\plantCapper.sysj line: 9, column: 2
          thread8310(tdone,ends);
          thread8311(tdone,ends);
          thread8318(tdone,ends);
          thread8319(tdone,ends);
          thread8320(tdone,ends);
          int biggest8327 = 0;
          if(ends[2]>=biggest8327){
            biggest8327=ends[2];
          }
          if(ends[3]>=biggest8327){
            biggest8327=ends[3];
          }
          if(ends[6]>=biggest8327){
            biggest8327=ends[6];
          }
          if(ends[7]>=biggest8327){
            biggest8327=ends[7];
          }
          if(ends[8]>=biggest8327){
            biggest8327=ends[8];
          }
          if(biggest8327 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest8327 == 0){
            S8293=0;
            active[1]=0;
            ends[1]=0;
            S8293=0;
            break RUN;
          }
=======
      switch(S6091){
        case 0 : 
          S6091=0;
          break RUN;
        
        case 1 : 
          S6091=2;
          S6091=2;
          active[1]=0;
          ends[1]=0;
          S6091=0;
          break RUN;
>>>>>>> cc5cb389511926da6b29712bab8fcfd2c16e2c2c
        
      }
    }
  }

  public void init(){
<<<<<<< HEAD
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
=======
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
>>>>>>> cc5cb389511926da6b29712bab8fcfd2c16e2c2c
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
<<<<<<< HEAD
    bottleClamp_1 = new Signal();
    bottleNotClamp_1 = new Signal();
    capGrip_1 = new Signal();
    capNotGrip_1 = new Signal();
=======
>>>>>>> cc5cb389511926da6b29712bab8fcfd2c16e2c2c
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
<<<<<<< HEAD
      bottleAtPos4E.setpreclear();
      gripperZAxisLoweredE.setpreclear();
      gripperZAxisLiftedE.setpreclear();
      gripperTurnHomePosE.setpreclear();
      gripperTurnFinalPosE.setpreclear();
      bottleClamp_1.setpreclear();
      bottleNotClamp_1.setpreclear();
      capGrip_1.setpreclear();
      capNotGrip_1.setpreclear();
=======
      gripperZAxisLoweredM.setpreclear();
      gripperZAxisLiftedM.setpreclear();
      gripperTurnHomePosM.setpreclear();
      gripperTurnFinalPosM.setpreclear();
>>>>>>> cc5cb389511926da6b29712bab8fcfd2c16e2c2c
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
<<<<<<< HEAD
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
      bottleClamp_1.setClear();
      bottleNotClamp_1.setClear();
      capGrip_1.setClear();
      capNotGrip_1.setClear();
=======
      gripperZAxisLoweredM.sethook();
      gripperZAxisLoweredM.setClear();
      gripperZAxisLiftedM.sethook();
      gripperZAxisLiftedM.setClear();
      gripperTurnHomePosM.sethook();
      gripperTurnHomePosM.setClear();
      gripperTurnFinalPosM.sethook();
      gripperTurnFinalPosM.setClear();
>>>>>>> cc5cb389511926da6b29712bab8fcfd2c16e2c2c
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
