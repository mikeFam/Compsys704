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
  private int S4566 = 1;
  private int S1179 = 1;
  private int S925 = 1;
  private int S850 = 1;
  private int S844 = 1;
  private int S858 = 1;
  private int S866 = 1;
  private int S874 = 1;
  private int S882 = 1;
  private int S4549 = 1;
  private int S2021 = 1;
  private int S1371 = 1;
  private int S1192 = 1;
  private int S1276 = 1;
  private int S1197 = 1;
  private int S1232 = 1;
  private int S1231 = 1;
  private int S1206 = 1;
  private int S1214 = 1;
  private int S4564 = 1;
  private int S4563 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread4604(int [] tdone, int [] ends){
        switch(S4564){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S4563){
          case 0 : 
            if(mode.getprestatus()){//sysj\controllerCapper.sysj line: 68, column: 9
              S4563=1;
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

  public void thread4600(int [] tdone, int [] ends){
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

  public void thread4599(int [] tdone, int [] ends){
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

  public void thread4597(int [] tdone, int [] ends){
        S1214=1;
    System.out.println("Cap gripped");//sysj\controllerCapper.sysj line: 50, column: 7
    capGripperPos5Extend.setPresent();//sysj\controllerCapper.sysj line: 51, column: 6
    currsigs.addElement(capGripperPos5Extend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread4596(int [] tdone, int [] ends){
        S1206=1;
    System.out.println("Gripper twisting");//sysj\controllerCapper.sysj line: 47, column: 7
    gripperTurnExtend.setPresent();//sysj\controllerCapper.sysj line: 48, column: 6
    currsigs.addElement(gripperTurnExtend);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread4595(int [] tdone, int [] ends){
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
              thread4596(tdone,ends);
              thread4597(tdone,ends);
              int biggest4598 = 0;
              if(ends[13]>=biggest4598){
                biggest4598=ends[13];
              }
              if(ends[14]>=biggest4598){
                biggest4598=ends[14];
              }
              if(biggest4598 == 1){
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
            thread4599(tdone,ends);
            thread4600(tdone,ends);
            int biggest4601 = 0;
            if(ends[13]>=biggest4601){
              biggest4601=ends[13];
            }
            if(ends[14]>=biggest4601){
              biggest4601=ends[14];
            }
            if(biggest4601 == 1){
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            //FINXME code
            if(biggest4601 == 0){
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

  public void thread4594(int [] tdone, int [] ends){
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

  public void thread4593(int [] tdone, int [] ends){
        switch(S1276){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus() && gripperTurnFinalPos.getprestatus()){//sysj\controllerCapper.sysj line: 42, column: 12
          S1276=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        else {
          thread4594(tdone,ends);
          thread4595(tdone,ends);
          int biggest4602 = 0;
          if(ends[11]>=biggest4602){
            biggest4602=ends[11];
          }
          if(ends[12]>=biggest4602){
            biggest4602=ends[12];
          }
          if(biggest4602 == 1){
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
          }
          //FINXME code
          if(biggest4602 == 0){
            S1276=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
          }
        }
        break;
      
    }
  }

  public void thread4592(int [] tdone, int [] ends){
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

  public void thread4589(int [] tdone, int [] ends){
        S1232=1;
    S1231=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread4588(int [] tdone, int [] ends){
        S1197=1;
    cylPos5ZaxisExtend.setPresent();//sysj\controllerCapper.sysj line: 44, column: 7
    currsigs.addElement(cylPos5ZaxisExtend);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread4587(int [] tdone, int [] ends){
        S1276=1;
    System.out.println("Gripper lowering");//sysj\controllerCapper.sysj line: 43, column: 6
    thread4588(tdone,ends);
    thread4589(tdone,ends);
    int biggest4590 = 0;
    if(ends[11]>=biggest4590){
      biggest4590=ends[11];
    }
    if(ends[12]>=biggest4590){
      biggest4590=ends[12];
    }
    if(biggest4590 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread4586(int [] tdone, int [] ends){
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

  public void thread4585(int [] tdone, int [] ends){
        switch(S4549){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2021){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\controllerCapper.sysj line: 30, column: 10
              S2021=1;
              jobDone_1.setClear();//sysj\controllerCapper.sysj line: 31, column: 4
              System.out.println("Auto Mode");//sysj\controllerCapper.sysj line: 32, column: 4
              S1371=0;
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
              S2021=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              switch(S1371){
                case 0 : 
                  if(bottleAtPos4.getprestatus()){//sysj\controllerCapper.sysj line: 34, column: 11
                    S1371=1;
                    thread4586(tdone,ends);
                    thread4587(tdone,ends);
                    int biggest4591 = 0;
                    if(ends[9]>=biggest4591){
                      biggest4591=ends[9];
                    }
                    if(ends[10]>=biggest4591){
                      biggest4591=ends[10];
                    }
                    if(biggest4591 == 1){
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
                  thread4592(tdone,ends);
                  thread4593(tdone,ends);
                  int biggest4603 = 0;
                  if(ends[9]>=biggest4603){
                    biggest4603=ends[9];
                  }
                  if(ends[10]>=biggest4603){
                    biggest4603=ends[10];
                  }
                  if(biggest4603 == 1){
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  //FINXME code
                  if(biggest4603 == 0){
                    System.out.println("Release/ungrip cap");//sysj\controllerCapper.sysj line: 53, column: 5
                    S1371=2;
                    System.out.println("Gripper untwisting");//sysj\controllerCapper.sysj line: 55, column: 6
                    gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 56, column: 6
                    currsigs.addElement(gripperTurnRetract);
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  break;
                
                case 2 : 
                  if(gripperTurnHomePos.getprestatus()){//sysj\controllerCapper.sysj line: 54, column: 12
                    System.out.println("Gripper untwisted");//sysj\controllerCapper.sysj line: 58, column: 5
                    S1371=3;
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  else {
                    gripperTurnRetract.setPresent();//sysj\controllerCapper.sysj line: 56, column: 6
                    currsigs.addElement(gripperTurnRetract);
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  break;
                
                case 3 : 
                  if(gripperZAxisLifted.getprestatus()){//sysj\controllerCapper.sysj line: 60, column: 12
                    System.out.println("Gripper lifted");//sysj\controllerCapper.sysj line: 61, column: 5
                    jobDone_1.setPresent();//sysj\controllerCapper.sysj line: 62, column: 5
                    currsigs.addElement(jobDone_1);
                    S2021=0;
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
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4583(int [] tdone, int [] ends){
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

  public void thread4582(int [] tdone, int [] ends){
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

  public void thread4581(int [] tdone, int [] ends){
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

  public void thread4580(int [] tdone, int [] ends){
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

  public void thread4579(int [] tdone, int [] ends){
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

  public void thread4577(int [] tdone, int [] ends){
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

  public void thread4576(int [] tdone, int [] ends){
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

  public void thread4575(int [] tdone, int [] ends){
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

  public void thread4574(int [] tdone, int [] ends){
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

  public void thread4573(int [] tdone, int [] ends){
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

  public void thread4572(int [] tdone, int [] ends){
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
              thread4573(tdone,ends);
              thread4574(tdone,ends);
              thread4575(tdone,ends);
              thread4576(tdone,ends);
              thread4577(tdone,ends);
              int biggest4578 = 0;
              if(ends[3]>=biggest4578){
                biggest4578=ends[3];
              }
              if(ends[4]>=biggest4578){
                biggest4578=ends[4];
              }
              if(ends[5]>=biggest4578){
                biggest4578=ends[5];
              }
              if(ends[6]>=biggest4578){
                biggest4578=ends[6];
              }
              if(ends[7]>=biggest4578){
                biggest4578=ends[7];
              }
              if(biggest4578 == 1){
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
              thread4579(tdone,ends);
              thread4580(tdone,ends);
              thread4581(tdone,ends);
              thread4582(tdone,ends);
              thread4583(tdone,ends);
              int biggest4584 = 0;
              if(ends[3]>=biggest4584){
                biggest4584=ends[3];
              }
              if(ends[4]>=biggest4584){
                biggest4584=ends[4];
              }
              if(ends[5]>=biggest4584){
                biggest4584=ends[5];
              }
              if(ends[6]>=biggest4584){
                biggest4584=ends[6];
              }
              if(ends[7]>=biggest4584){
                biggest4584=ends[7];
              }
              if(biggest4584 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest4584 == 0){
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

  public void thread4570(int [] tdone, int [] ends){
        S4564=1;
    S4563=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread4569(int [] tdone, int [] ends){
        S4549=1;
    S2021=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread4568(int [] tdone, int [] ends){
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
      switch(S4566){
        case 0 : 
          S4566=0;
          break RUN;
        
        case 1 : 
          S4566=2;
          S4566=2;
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread4568(tdone,ends);
          thread4569(tdone,ends);
          thread4570(tdone,ends);
          int biggest4571 = 0;
          if(ends[2]>=biggest4571){
            biggest4571=ends[2];
          }
          if(ends[8]>=biggest4571){
            biggest4571=ends[8];
          }
          if(ends[15]>=biggest4571){
            biggest4571=ends[15];
          }
          if(biggest4571 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\controllerCapper.sysj line: 9, column: 2
          thread4572(tdone,ends);
          thread4585(tdone,ends);
          thread4604(tdone,ends);
          int biggest4605 = 0;
          if(ends[2]>=biggest4605){
            biggest4605=ends[2];
          }
          if(ends[8]>=biggest4605){
            biggest4605=ends[8];
          }
          if(ends[15]>=biggest4605){
            biggest4605=ends[15];
          }
          if(biggest4605 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4605 == 0){
            S4566=0;
            active[1]=0;
            ends[1]=0;
            S4566=0;
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
