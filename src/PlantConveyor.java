import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantConveyor extends ClockDomain{
  public PlantConveyor(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private Signal bottleDec_1;
  private Signal bottleAtLoad_1;
  private Signal bottleAt5_1;
  private Signal motorOn_1;
  private Signal motorOff_1;
  private Signal empty_1;
  private Signal bottlePos_1;
  private int bottlecount_thread_5;//sysj\plantConveyor.sysj line: 77, column: 3
  private int data_thread_3;//sysj\plantConveyor.sysj line: 29, column: 3
  private int S4282 = 1;
  private int S3645 = 1;
  private int S3562 = 1;
  private int S3758 = 1;
  private int S3646 = 1;
  private int S3664 = 1;
  private int S3835 = 1;
  private int S3783 = 1;
  private int S3759 = 1;
  private int S3897 = 1;
  private int S3840 = 1;
  private int S3915 = 1;
  private int S3905 = 1;
  private int S3913 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread4299(int [] tdone, int [] ends){
        switch(S3913){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\plantConveyor.sysj line: 95, column: 24
          bottleLeftPos5E.setPresent();//sysj\plantConveyor.sysj line: 95, column: 40
          currsigs.addElement(bottleLeftPos5E);
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

  public void thread4298(int [] tdone, int [] ends){
        switch(S3905){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantConveyor.sysj line: 93, column: 24
          bottleAtPos1E.setPresent();//sysj\plantConveyor.sysj line: 93, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread4297(int [] tdone, int [] ends){
        switch(S3915){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread4298(tdone,ends);
        thread4299(tdone,ends);
        int biggest4300 = 0;
        if(ends[7]>=biggest4300){
          biggest4300=ends[7];
        }
        if(ends[8]>=biggest4300){
          biggest4300=ends[8];
        }
        if(biggest4300 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest4300 == 0){
          S3915=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread4296(int [] tdone, int [] ends){
        switch(S3897){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3840){
          case 0 : 
            S3840=0;
            if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 79, column: 12
              if(bottlecount_thread_5 > 0) {//sysj\plantConveyor.sysj line: 80, column: 5
                bottlecount_thread_5 = bottlecount_thread_5 - 1;//sysj\plantConveyor.sysj line: 81, column: 6
              }
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 83, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 84, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
                  currsigs.addElement(empty_1);
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
                  currsigs.addElement(empty_1);
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 83, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 84, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
                  currsigs.addElement(empty_1);
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
                  currsigs.addElement(empty_1);
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            break;
          
          case 1 : 
            S3840=1;
            S3840=0;
            if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 79, column: 12
              if(bottlecount_thread_5 > 0) {//sysj\plantConveyor.sysj line: 80, column: 5
                bottlecount_thread_5 = bottlecount_thread_5 - 1;//sysj\plantConveyor.sysj line: 81, column: 6
              }
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 83, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 84, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
                  currsigs.addElement(empty_1);
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
                  currsigs.addElement(empty_1);
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 83, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 84, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
                  currsigs.addElement(empty_1);
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
                  currsigs.addElement(empty_1);
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S3840=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4295(int [] tdone, int [] ends){
        switch(S3835){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3783){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\plantConveyor.sysj line: 56, column: 10
              S3783=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S3759){
                case 0 : 
                  if(motorOn_1.getprestatus()){//sysj\plantConveyor.sysj line: 60, column: 12
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 62, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(1);//sysj\plantConveyor.sysj line: 62, column: 6
                    System.out.println("1");//sysj\plantConveyor.sysj line: 63, column: 6
                    S3759=1;
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
                
                case 1 : 
                  if(enable.getprestatus() && motorOn_1.getprestatus()){//sysj\plantConveyor.sysj line: 64, column: 13
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 65, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(2);//sysj\plantConveyor.sysj line: 65, column: 6
                    bottleAt5_1.setPresent();//sysj\plantConveyor.sysj line: 66, column: 6
                    currsigs.addElement(bottleAt5_1);
                    S3759=2;
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
                
                case 2 : 
                  if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 67, column: 13
                    System.out.println("2");//sysj\plantConveyor.sysj line: 68, column: 6
                    bottleDec_1.setPresent();//sysj\plantConveyor.sysj line: 69, column: 6
                    currsigs.addElement(bottleDec_1);
                    System.out.println("Load");//sysj\plantConveyor.sysj line: 58, column: 6
                    bottleAtLoad_1.setPresent();//sysj\plantConveyor.sysj line: 59, column: 6
                    currsigs.addElement(bottleAtLoad_1);
                    S3759=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 72, column: 10
              S3783=0;
              System.out.println("Load");//sysj\plantConveyor.sysj line: 58, column: 6
              bottleAtLoad_1.setPresent();//sysj\plantConveyor.sysj line: 59, column: 6
              currsigs.addElement(bottleAtLoad_1);
              S3759=0;
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
        break;
      
    }
  }

  public void thread4294(int [] tdone, int [] ends){
        switch(S3758){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3646){
          case 0 : 
            switch(S3664){
              case 0 : 
                if(bottleAt5_1.getprestatus()){//sysj\plantConveyor.sysj line: 32, column: 11
                  S3646=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 34, column: 6
                  currsigs.addElement(bottleAtPos1);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtLoad_1.getprestatus()){//sysj\plantConveyor.sysj line: 38, column: 11
                  S3646=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 40, column: 6
                  currsigs.addElement(bottleLeftPos5);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S3646=1;
            data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 29, column: 3
            System.out.println("data = " + data_thread_3);//sysj\plantConveyor.sysj line: 30, column: 3
            S3646=0;
            if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantConveyor.sysj line: 31, column: 7
              S3664=0;
              System.out.println("helloAt1");//sysj\plantConveyor.sysj line: 33, column: 6
              bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 34, column: 6
              currsigs.addElement(bottleAtPos1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S3664=1;
              if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantConveyor.sysj line: 37, column: 12
                System.out.println("helloAt5");//sysj\plantConveyor.sysj line: 39, column: 6
                bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 40, column: 6
                currsigs.addElement(bottleLeftPos5);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S3646=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4293(int [] tdone, int [] ends){
        switch(S3645){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3562){
          case 0 : 
            if((motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 14, column: 21
              S3562=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 16, column: 5
              currsigs.addElement(motorOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 18, column: 10
              S3562=2;
              if((!motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 19, column: 20
                S3562=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("motorOn");//sysj\plantConveyor.sysj line: 20, column: 5
                motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 21, column: 5
                currsigs.addElement(motorOn_1);
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
            if((!motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 19, column: 20
              S3562=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 21, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 23, column: 10
              S3562=0;
              if((motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 14, column: 21
                S3562=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("motorOff");//sysj\plantConveyor.sysj line: 15, column: 5
                motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 16, column: 5
                currsigs.addElement(motorOff_1);
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

  public void thread4290(int [] tdone, int [] ends){
        S3913=1;
    if(bottleLeftPos5.getprestatus()){//sysj\plantConveyor.sysj line: 95, column: 24
      bottleLeftPos5E.setPresent();//sysj\plantConveyor.sysj line: 95, column: 40
      currsigs.addElement(bottleLeftPos5E);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread4289(int [] tdone, int [] ends){
        S3905=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantConveyor.sysj line: 93, column: 24
      bottleAtPos1E.setPresent();//sysj\plantConveyor.sysj line: 93, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread4288(int [] tdone, int [] ends){
        S3915=1;
    thread4289(tdone,ends);
    thread4290(tdone,ends);
    int biggest4291 = 0;
    if(ends[7]>=biggest4291){
      biggest4291=ends[7];
    }
    if(ends[8]>=biggest4291){
      biggest4291=ends[8];
    }
    if(biggest4291 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread4287(int [] tdone, int [] ends){
        S3897=1;
    bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 77, column: 3
    S3840=0;
    if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 79, column: 12
      if(bottlecount_thread_5 > 0) {//sysj\plantConveyor.sysj line: 80, column: 5
        bottlecount_thread_5 = bottlecount_thread_5 - 1;//sysj\plantConveyor.sysj line: 81, column: 6
      }
      if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 83, column: 12
        bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 84, column: 5
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
          currsigs.addElement(empty_1);
          S3840=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S3840=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
          currsigs.addElement(empty_1);
          S3840=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S3840=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 83, column: 12
        bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 84, column: 5
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
          currsigs.addElement(empty_1);
          S3840=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S3840=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 86, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 87, column: 4
          currsigs.addElement(empty_1);
          S3840=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S3840=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
  }

  public void thread4286(int [] tdone, int [] ends){
        S3835=1;
    S3783=0;
    System.out.println("Load");//sysj\plantConveyor.sysj line: 58, column: 6
    bottleAtLoad_1.setPresent();//sysj\plantConveyor.sysj line: 59, column: 6
    currsigs.addElement(bottleAtLoad_1);
    S3759=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4285(int [] tdone, int [] ends){
        S3758=1;
    data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 29, column: 3
    System.out.println("data = " + data_thread_3);//sysj\plantConveyor.sysj line: 30, column: 3
    S3646=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantConveyor.sysj line: 31, column: 7
      S3664=0;
      System.out.println("helloAt1");//sysj\plantConveyor.sysj line: 33, column: 6
      bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 34, column: 6
      currsigs.addElement(bottleAtPos1);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S3664=1;
      if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantConveyor.sysj line: 37, column: 12
        System.out.println("helloAt5");//sysj\plantConveyor.sysj line: 39, column: 6
        bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 40, column: 6
        currsigs.addElement(bottleLeftPos5);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        S3646=1;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
  }

  public void thread4284(int [] tdone, int [] ends){
        S3645=1;
    S3562=0;
    if((motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 14, column: 21
      S3562=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("motorOff");//sysj\plantConveyor.sysj line: 15, column: 5
      motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 16, column: 5
      currsigs.addElement(motorOff_1);
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
      switch(S4282){
        case 0 : 
          S4282=0;
          break RUN;
        
        case 1 : 
          S4282=2;
          S4282=2;
          bottleDec_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          bottleAtLoad_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          bottleAt5_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          motorOn_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          motorOff_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          empty_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          bottlePos_1.setClear();//sysj\plantConveyor.sysj line: 10, column: 2
          bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 11, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 11, column: 2
          thread4284(tdone,ends);
          thread4285(tdone,ends);
          thread4286(tdone,ends);
          thread4287(tdone,ends);
          thread4288(tdone,ends);
          int biggest4292 = 0;
          if(ends[2]>=biggest4292){
            biggest4292=ends[2];
          }
          if(ends[3]>=biggest4292){
            biggest4292=ends[3];
          }
          if(ends[4]>=biggest4292){
            biggest4292=ends[4];
          }
          if(ends[5]>=biggest4292){
            biggest4292=ends[5];
          }
          if(ends[6]>=biggest4292){
            biggest4292=ends[6];
          }
          if(biggest4292 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleDec_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          bottleAtLoad_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          bottleAt5_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          motorOn_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          motorOff_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          empty_1.setClear();//sysj\plantConveyor.sysj line: 9, column: 2
          bottlePos_1.setClear();//sysj\plantConveyor.sysj line: 10, column: 2
          thread4293(tdone,ends);
          thread4294(tdone,ends);
          thread4295(tdone,ends);
          thread4296(tdone,ends);
          thread4297(tdone,ends);
          int biggest4301 = 0;
          if(ends[2]>=biggest4301){
            biggest4301=ends[2];
          }
          if(ends[3]>=biggest4301){
            biggest4301=ends[3];
          }
          if(ends[4]>=biggest4301){
            biggest4301=ends[4];
          }
          if(ends[5]>=biggest4301){
            biggest4301=ends[5];
          }
          if(ends[6]>=biggest4301){
            biggest4301=ends[6];
          }
          if(biggest4301 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4301 == 0){
            S4282=0;
            active[1]=0;
            ends[1]=0;
            S4282=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleDec_1 = new Signal();
    bottleAtLoad_1 = new Signal();
    bottleAt5_1 = new Signal();
    motorOn_1 = new Signal();
    motorOff_1 = new Signal();
    empty_1 = new Signal();
    bottlePos_1 = new Signal();
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
          motConveyorOnOff.gethook();
          enable.gethook();
          refill.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      bottleDec_1.setpreclear();
      bottleAtLoad_1.setpreclear();
      bottleAt5_1.setpreclear();
      motorOn_1.setpreclear();
      motorOff_1.setpreclear();
      empty_1.setpreclear();
      bottlePos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      bottleDec_1.setClear();
      bottleAtLoad_1.setClear();
      bottleAt5_1.setClear();
      motorOn_1.setClear();
      motorOff_1.setClear();
      empty_1.setClear();
      bottlePos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
