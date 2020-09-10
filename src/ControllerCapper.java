import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ControllerCapper extends ClockDomain{
  public ControllerCapper(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal cylPos5ZaxisExtendM = new Signal("cylPos5ZaxisExtendM", Signal.INPUT);
  public Signal gripperTurnRetractM = new Signal("gripperTurnRetractM", Signal.INPUT);
  public Signal gripperTurnExtendM = new Signal("gripperTurnExtendM", Signal.INPUT);
  public Signal capGripperPos5ExtendM = new Signal("capGripperPos5ExtendM", Signal.INPUT);
  public Signal cylClampBottleExtendM = new Signal("cylClampBottleExtendM", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private Signal jobDone_1;
  private int S5110 = 1;
  private int S1179 = 1;
  private int S925 = 1;
  private int S850 = 1;
  private int S844 = 1;
  private int S858 = 1;
  private int S866 = 1;
  private int S874 = 1;
  private int S882 = 1;
  private int S5093 = 1;
  private int S2157 = 1;
  private int S1423 = 1;
  private int S1192 = 1;
  private int S1302 = 1;
  private int S1275 = 1;
  private int S1197 = 1;
  private int S1232 = 1;
  private int S1231 = 1;
  private int S1206 = 1;
  private int S1214 = 1;
  private int S5108 = 1;
  private int S5107 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread5148(int [] tdone, int [] ends){
        switch(S5108){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S5107){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerCapper.sysj line: 68, column: 9
              S5107=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerCapper.sysj line: 70, column: 7
                selectM_1.setPresent();//sysj\controllerCapper.sysj line: 71, column: 5
                currsigs.addElement(selectM_1);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                selectA_1.setPresent();//sysj\controllerCapper.sysj line: 74, column: 5
                currsigs.addElement(selectA_1);
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controllerCapper.sysj line: 70, column: 7
              selectM_1.setPresent();//sysj\controllerCapper.sysj line: 71, column: 5
              currsigs.addElement(selectM_1);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              selectA_1.setPresent();//sysj\controllerCapper.sysj line: 74, column: 5
              currsigs.addElement(selectA_1);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5144(int [] tdone, int [] ends){
        switch(S1214){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 51, column: 6
        currsigs.addElement(capGripperPos5Extend);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread5143(int [] tdone, int [] ends){
        switch(S1206){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 48, column: 6
        currsigs.addElement(gripperTurnExtend);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread5141(int [] tdone, int [] ends){
        S1214=1;
    System.out.println("Cap gripped");//sysj\controllerCapper.sysj line: 50, column: 7
    capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 51, column: 6
    currsigs.addElement(capGripperPos5Extend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread5140(int [] tdone, int [] ends){
        S1206=1;
    System.out.println("Gripper twisting");//sysj\controllerCapper.sysj line: 47, column: 7
    gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 48, column: 6
    currsigs.addElement(gripperTurnExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread5139(int [] tdone, int [] ends){
        switch(S1232){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S1231){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\controllerCapper.sysj line: 46, column: 14
              S1231=1;
              thread5140(tdone,ends);
              thread5141(tdone,ends);
              int biggest5142 = 0;
              if(ends[13]>=biggest5142){
                biggest5142=ends[13];
              }
              if(ends[14]>=biggest5142){
                biggest5142=ends[14];
              }
              if(biggest5142 == 1){
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            thread5143(tdone,ends);
            thread5144(tdone,ends);
            int biggest5145 = 0;
            if(ends[13]>=biggest5145){
              biggest5145=ends[13];
            }
            if(ends[14]>=biggest5145){
              biggest5145=ends[14];
            }
            if(biggest5145 == 1){
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            //FINXME code
            if(biggest5145 == 0){
              S1232=0;
              active[12]=0;
              ends[12]=0;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5138(int [] tdone, int [] ends){
        switch(S1197){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 44, column: 7
        currsigs.addElement(cylPos5ZaxisExtend);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread5137(int [] tdone, int [] ends){
        switch(S1302){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S1275){
          case 0 : 
            if(gripperZAxisLowered.getprestatus() && gripperTurnFinalPos.getprestatus()){//sysj\controllerCapper.sysj line: 42, column: 12
              System.out.println("Release/ungrip cap");//sysj\controllerCapper.sysj line: 53, column: 5
              S1275=1;
              System.out.println("Gripper untwisting");//sysj\controllerCapper.sysj line: 55, column: 6
              gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 56, column: 6
              currsigs.addElement(gripperTurnRetract);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              thread5138(tdone,ends);
              thread5139(tdone,ends);
              int biggest5146 = 0;
              if(ends[11]>=biggest5146){
                biggest5146=ends[11];
              }
              if(ends[12]>=biggest5146){
                biggest5146=ends[12];
              }
              if(biggest5146 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              //FINXME code
              if(biggest5146 == 0){
                System.out.println("Release/ungrip cap");//sysj\controllerCapper.sysj line: 53, column: 5
                S1275=1;
                System.out.println("Gripper untwisting");//sysj\controllerCapper.sysj line: 55, column: 6
                gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 56, column: 6
                currsigs.addElement(gripperTurnRetract);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            break;
          
          case 1 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\controllerCapper.sysj line: 54, column: 12
              System.out.println("Gripper untwisted");//sysj\controllerCapper.sysj line: 58, column: 5
              S1275=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 56, column: 6
              currsigs.addElement(gripperTurnRetract);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\controllerCapper.sysj line: 59, column: 12
              System.out.println("Gripper lifted");//sysj\controllerCapper.sysj line: 60, column: 5
              jobDone_1.setPresent();//sysj\controllerCapper.sysj line: 61, column: 5
              currsigs.addElement(jobDone_1);
              S1302=0;
              active[10]=0;
              ends[10]=0;
              tdone[10]=1;
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5136(int [] tdone, int [] ends){
        switch(S1192){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if((gripperZAxisLifted.getprestatus() && jobDone_1.getprestatus())){//sysj\controllerCapper.sysj line: 35, column: 23
          System.out.println("Unclamp the bottle");//sysj\controllerCapper.sysj line: 39, column: 5
          S1192=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        else {
          cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 37, column: 6
          currsigs.addElement(cylClampBottleExtend);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread5133(int [] tdone, int [] ends){
        S1232=1;
    S1231=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread5132(int [] tdone, int [] ends){
        S1197=1;
    cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 44, column: 7
    currsigs.addElement(cylPos5ZaxisExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread5131(int [] tdone, int [] ends){
        S1302=1;
    S1275=0;
    System.out.println("Gripper lowering");//sysj\controllerCapper.sysj line: 43, column: 6
    thread5132(tdone,ends);
    thread5133(tdone,ends);
    int biggest5134 = 0;
    if(ends[11]>=biggest5134){
      biggest5134=ends[11];
    }
    if(ends[12]>=biggest5134){
      biggest5134=ends[12];
    }
    if(biggest5134 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread5130(int [] tdone, int [] ends){
        S1192=1;
    if((gripperZAxisLifted.getprestatus() && jobDone_1.getprestatus())){//sysj\controllerCapper.sysj line: 35, column: 23
      System.out.println("Unclamp the bottle");//sysj\controllerCapper.sysj line: 39, column: 5
      S1192=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      System.out.println("Bottle Clamped");//sysj\controllerCapper.sysj line: 36, column: 6
      cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 37, column: 6
      currsigs.addElement(cylClampBottleExtend);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread5129(int [] tdone, int [] ends){
        switch(S5093){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2157){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerCapper.sysj line: 30, column: 10
              S2157=1;
              jobDone_1.setClear();//sysj\controllerCapper.sysj line: 31, column: 4
              System.out.println("Auto Mode");//sysj\controllerCapper.sysj line: 32, column: 4
              S1423=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            jobDone_1.setClear();//sysj\controllerCapper.sysj line: 31, column: 4
            if(selectM_1.getprestatus()){//sysj\controllerCapper.sysj line: 33, column: 10
              S2157=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              switch(S1423){
                case 0 : 
                  if(bottleAtPos4.getprestatus()){//sysj\controllerCapper.sysj line: 34, column: 11
                    S1423=1;
                    thread5130(tdone,ends);
                    thread5131(tdone,ends);
                    int biggest5135 = 0;
                    if(ends[9]>=biggest5135){
                      biggest5135=ends[9];
                    }
                    if(ends[10]>=biggest5135){
                      biggest5135=ends[10];
                    }
                    if(biggest5135 == 1){
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  break;
                
                case 1 : 
                  thread5136(tdone,ends);
                  thread5137(tdone,ends);
                  int biggest5147 = 0;
                  if(ends[9]>=biggest5147){
                    biggest5147=ends[9];
                  }
                  if(ends[10]>=biggest5147){
                    biggest5147=ends[10];
                  }
                  if(biggest5147 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  //FINXME code
                  if(biggest5147 == 0){
                    S2157=0;
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5127(int [] tdone, int [] ends){
        switch(S882){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 23, column: 26
          cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 23, column: 49
          currsigs.addElement(cylClampBottleExtend);
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
  }

  public void thread5126(int [] tdone, int [] ends){
        switch(S874){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capGripperPos5ExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 21, column: 26
          capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 21, column: 49
          currsigs.addElement(capGripperPos5Extend);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread5125(int [] tdone, int [] ends){
        switch(S866){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 19, column: 26
          gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 19, column: 46
          currsigs.addElement(gripperTurnExtend);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread5124(int [] tdone, int [] ends){
        switch(S858){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetractM.getprestatus()){//sysj\controllerCapper.sysj line: 17, column: 26
          gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 17, column: 47
          currsigs.addElement(gripperTurnRetract);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread5123(int [] tdone, int [] ends){
        switch(S850){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S844){
          case 0 : 
            S844=0;
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 15, column: 26
              cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 15, column: 47
              currsigs.addElement(cylPos5ZaxisExtend);
              S844=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S844=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S844=1;
            S844=0;
            if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 15, column: 26
              cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 15, column: 47
              currsigs.addElement(cylPos5ZaxisExtend);
              S844=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S844=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5121(int [] tdone, int [] ends){
        S882=1;
    if(cylClampBottleExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 23, column: 26
      cylClampBottleExtend.setPresent();//sysj\controllerCapper.sysj line: 23, column: 49
      currsigs.addElement(cylClampBottleExtend);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread5120(int [] tdone, int [] ends){
        S874=1;
    if(capGripperPos5ExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 21, column: 26
      capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 21, column: 49
      currsigs.addElement(capGripperPos5Extend);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread5119(int [] tdone, int [] ends){
        S866=1;
    if(gripperTurnExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 19, column: 26
      gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 19, column: 46
      currsigs.addElement(gripperTurnExtend);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread5118(int [] tdone, int [] ends){
        S858=1;
    if(gripperTurnRetractM.getprestatus()){//sysj\controllerCapper.sysj line: 17, column: 26
      gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 17, column: 47
      currsigs.addElement(gripperTurnRetract);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread5117(int [] tdone, int [] ends){
        S850=1;
    S844=0;
    if(cylPos5ZaxisExtendM.getprestatus()){//sysj\controllerCapper.sysj line: 15, column: 26
      cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 15, column: 47
      currsigs.addElement(cylPos5ZaxisExtend);
      S844=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S844=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread5116(int [] tdone, int [] ends){
        switch(S1179){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S925){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\controllerCapper.sysj line: 13, column: 10
              S925=1;
              thread5117(tdone,ends);
              thread5118(tdone,ends);
              thread5119(tdone,ends);
              thread5120(tdone,ends);
              thread5121(tdone,ends);
              int biggest5122 = 0;
              if(ends[3]>=biggest5122){
                biggest5122=ends[3];
              }
              if(ends[4]>=biggest5122){
                biggest5122=ends[4];
              }
              if(ends[5]>=biggest5122){
                biggest5122=ends[5];
              }
              if(ends[6]>=biggest5122){
                biggest5122=ends[6];
              }
              if(ends[7]>=biggest5122){
                biggest5122=ends[7];
              }
              if(biggest5122 == 1){
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
          
          case 1 : 
            if(selectA_1.getprestatus()){//sysj\controllerCapper.sysj line: 14, column: 10
              S925=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread5123(tdone,ends);
              thread5124(tdone,ends);
              thread5125(tdone,ends);
              thread5126(tdone,ends);
              thread5127(tdone,ends);
              int biggest5128 = 0;
              if(ends[3]>=biggest5128){
                biggest5128=ends[3];
              }
              if(ends[4]>=biggest5128){
                biggest5128=ends[4];
              }
              if(ends[5]>=biggest5128){
                biggest5128=ends[5];
              }
              if(ends[6]>=biggest5128){
                biggest5128=ends[6];
              }
              if(ends[7]>=biggest5128){
                biggest5128=ends[7];
              }
              if(biggest5128 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest5128 == 0){
                S925=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5114(int [] tdone, int [] ends){
        S5108=1;
    S5107=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread5113(int [] tdone, int [] ends){
        S5093=1;
    S2157=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread5112(int [] tdone, int [] ends){
        S1179=1;
    S925=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S5110){
        case 0 : 
          S5110=0;
          break RUN;
        
        case 1 : 
          S5110=2;
          S5110=2;
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread5112(tdone,ends);
          thread5113(tdone,ends);
          thread5114(tdone,ends);
          int biggest5115 = 0;
          if(ends[2]>=biggest5115){
            biggest5115=ends[2];
          }
          if(ends[8]>=biggest5115){
            biggest5115=ends[8];
          }
          if(ends[15]>=biggest5115){
            biggest5115=ends[15];
          }
          if(biggest5115 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread5116(tdone,ends);
          thread5129(tdone,ends);
          thread5148(tdone,ends);
          int biggest5149 = 0;
          if(ends[2]>=biggest5149){
            biggest5149=ends[2];
          }
          if(ends[8]>=biggest5149){
            biggest5149=ends[8];
          }
          if(ends[15]>=biggest5149){
            biggest5149=ends[15];
          }
          if(biggest5149 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5149 == 0){
            S5110=0;
            active[1]=0;
            ends[1]=0;
            S5110=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    selectM_1 = new Signal();
    selectA_1 = new Signal();
    jobDone_1 = new Signal();
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
          bottleAtPos4.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          mode.gethook();
          cylPos5ZaxisExtendM.gethook();
          gripperTurnRetractM.gethook();
          gripperTurnExtendM.gethook();
          capGripperPos5ExtendM.gethook();
          cylClampBottleExtendM.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      mode.setpreclear();
      cylPos5ZaxisExtendM.setpreclear();
      gripperTurnRetractM.setpreclear();
      gripperTurnExtendM.setpreclear();
      capGripperPos5ExtendM.setpreclear();
      cylClampBottleExtendM.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
      jobDone_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = cylPos5ZaxisExtendM.getStatus() ? cylPos5ZaxisExtendM.setprepresent() : cylPos5ZaxisExtendM.setpreclear();
      cylPos5ZaxisExtendM.setpreval(cylPos5ZaxisExtendM.getValue());
      cylPos5ZaxisExtendM.setClear();
      dummyint = gripperTurnRetractM.getStatus() ? gripperTurnRetractM.setprepresent() : gripperTurnRetractM.setpreclear();
      gripperTurnRetractM.setpreval(gripperTurnRetractM.getValue());
      gripperTurnRetractM.setClear();
      dummyint = gripperTurnExtendM.getStatus() ? gripperTurnExtendM.setprepresent() : gripperTurnExtendM.setpreclear();
      gripperTurnExtendM.setpreval(gripperTurnExtendM.getValue());
      gripperTurnExtendM.setClear();
      dummyint = capGripperPos5ExtendM.getStatus() ? capGripperPos5ExtendM.setprepresent() : capGripperPos5ExtendM.setpreclear();
      capGripperPos5ExtendM.setpreval(capGripperPos5ExtendM.getValue());
      capGripperPos5ExtendM.setClear();
      dummyint = cylClampBottleExtendM.getStatus() ? cylClampBottleExtendM.setprepresent() : cylClampBottleExtendM.setpreclear();
      cylClampBottleExtendM.setpreval(cylClampBottleExtendM.getValue());
      cylClampBottleExtendM.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      jobDone_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos4.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
        mode.gethook();
        cylPos5ZaxisExtendM.gethook();
        gripperTurnRetractM.gethook();
        gripperTurnExtendM.gethook();
        capGripperPos5ExtendM.gethook();
        cylClampBottleExtendM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
