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
  public Signal bottleAtLoad = new Signal("bottleAtLoad", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtLoadE = new Signal("bottleAtLoadE", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private Signal bottleDec_1;
  private Signal bottleAt1_1;
  private Signal bottleAtL_1;
  private Signal bottleAt5_1;
  private Signal motorOn_1;
  private Signal motorOff_1;
  private Signal empty_1;
  private Signal bottlePos_1;
  private int bottlecount_thread_5;//sysj\plantConveyor.sysj line: 86, column: 3
  private int data_thread_3;//sysj\plantConveyor.sysj line: 36, column: 3
  private int S10239 = 1;
  private int S8903 = 1;
  private int S8820 = 1;
  private int S8998 = 1;
  private int S8934 = 1;
  private int S8918 = 1;
  private int S8917 = 1;
  private int S9075 = 1;
  private int S9023 = 1;
  private int S8999 = 1;
  private int S9137 = 1;
  private int S9080 = 1;
  private int S9163 = 1;
  private int S9145 = 1;
  private int S9153 = 1;
  private int S9161 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread10258(int [] tdone, int [] ends){
        switch(S9161){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleAtLoad.getprestatus()){//sysj\plantConveyor.sysj line: 106, column: 24
          bottleAtLoadE.setPresent();//sysj\plantConveyor.sysj line: 106, column: 38
          currsigs.addElement(bottleAtLoadE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread10257(int [] tdone, int [] ends){
        switch(S9153){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\plantConveyor.sysj line: 104, column: 24
          bottleLeftPos5E.setPresent();//sysj\plantConveyor.sysj line: 104, column: 40
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

  public void thread10256(int [] tdone, int [] ends){
        switch(S9145){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\plantConveyor.sysj line: 102, column: 24
          bottleAtPos1E.setPresent();//sysj\plantConveyor.sysj line: 102, column: 38
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

  public void thread10255(int [] tdone, int [] ends){
        switch(S9163){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread10256(tdone,ends);
        thread10257(tdone,ends);
        thread10258(tdone,ends);
        int biggest10259 = 0;
        if(ends[7]>=biggest10259){
          biggest10259=ends[7];
        }
        if(ends[8]>=biggest10259){
          biggest10259=ends[8];
        }
        if(ends[9]>=biggest10259){
          biggest10259=ends[9];
        }
        if(biggest10259 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest10259 == 0){
          S9163=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread10254(int [] tdone, int [] ends){
        switch(S9137){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S9080){
          case 0 : 
            S9080=0;
            if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 88, column: 12
              if(bottlecount_thread_5 > 0) {//sysj\plantConveyor.sysj line: 89, column: 5
                bottlecount_thread_5 = bottlecount_thread_5 - 1;//sysj\plantConveyor.sysj line: 90, column: 6
              }
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 92, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 93, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
                  currsigs.addElement(empty_1);
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
                  currsigs.addElement(empty_1);
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 92, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 93, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
                  currsigs.addElement(empty_1);
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
                  currsigs.addElement(empty_1);
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            break;
          
          case 1 : 
            S9080=1;
            S9080=0;
            if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 88, column: 12
              if(bottlecount_thread_5 > 0) {//sysj\plantConveyor.sysj line: 89, column: 5
                bottlecount_thread_5 = bottlecount_thread_5 - 1;//sysj\plantConveyor.sysj line: 90, column: 6
              }
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 92, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 93, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
                  currsigs.addElement(empty_1);
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
                  currsigs.addElement(empty_1);
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 92, column: 12
                bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 93, column: 5
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
                  currsigs.addElement(empty_1);
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
                  empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
                  currsigs.addElement(empty_1);
                  S9080=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S9080=1;
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

  public void thread10253(int [] tdone, int [] ends){
        switch(S9075){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S9023){
          case 0 : 
            if(empty_1.getprestatus()){//sysj\plantConveyor.sysj line: 65, column: 10
              S9023=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S8999){
                case 0 : 
                  if(motorOn_1.getprestatus()){//sysj\plantConveyor.sysj line: 69, column: 12
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 71, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(1);//sysj\plantConveyor.sysj line: 71, column: 6
                    bottleAt1_1.setPresent();//sysj\plantConveyor.sysj line: 72, column: 6
                    currsigs.addElement(bottleAt1_1);
                    S8999=1;
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
                  if(enable.getprestatus() && motorOn_1.getprestatus()){//sysj\plantConveyor.sysj line: 73, column: 13
                    bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 74, column: 6
                    currsigs.addElement(bottlePos_1);
                    bottlePos_1.setValue(2);//sysj\plantConveyor.sysj line: 74, column: 6
                    bottleAt5_1.setPresent();//sysj\plantConveyor.sysj line: 75, column: 6
                    currsigs.addElement(bottleAt5_1);
                    S8999=2;
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
                  if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 76, column: 13
                    System.out.println("At Pos 2");//sysj\plantConveyor.sysj line: 77, column: 6
                    bottleDec_1.setPresent();//sysj\plantConveyor.sysj line: 78, column: 6
                    currsigs.addElement(bottleDec_1);
                    System.out.println("Load");//sysj\plantConveyor.sysj line: 67, column: 6
                    bottleAtL_1.setPresent();//sysj\plantConveyor.sysj line: 68, column: 6
                    currsigs.addElement(bottleAtL_1);
                    S8999=0;
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
            if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 81, column: 10
              S9023=0;
              System.out.println("Load");//sysj\plantConveyor.sysj line: 67, column: 6
              bottleAtL_1.setPresent();//sysj\plantConveyor.sysj line: 68, column: 6
              currsigs.addElement(bottleAtL_1);
              S8999=0;
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

  public void thread10252(int [] tdone, int [] ends){
        switch(S8998){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S8934){
          case 0 : 
            switch(S8918){
              case 0 : 
                if(bottleAt1_1.getprestatus()){//sysj\plantConveyor.sysj line: 38, column: 11
                  S8934=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  bottleAtLoad.setPresent();//sysj\plantConveyor.sysj line: 39, column: 6
                  currsigs.addElement(bottleAtLoad);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 1 : 
                switch(S8917){
                  case 0 : 
                    if(bottleAt5_1.getprestatus()){//sysj\plantConveyor.sysj line: 43, column: 11
                      S8934=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 44, column: 6
                      currsigs.addElement(bottleAtPos1);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(bottleAtL_1.getprestatus()){//sysj\plantConveyor.sysj line: 48, column: 11
                      S8934=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 49, column: 6
                      currsigs.addElement(bottleLeftPos5);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S8934=1;
            data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 36, column: 3
            S8934=0;
            if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantConveyor.sysj line: 37, column: 7
              S8918=0;
              bottleAtLoad.setPresent();//sysj\plantConveyor.sysj line: 39, column: 6
              currsigs.addElement(bottleAtLoad);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S8918=1;
              if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantConveyor.sysj line: 42, column: 12
                S8917=0;
                bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 44, column: 6
                currsigs.addElement(bottleAtPos1);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S8917=1;
                if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantConveyor.sysj line: 47, column: 12
                  bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 49, column: 6
                  currsigs.addElement(bottleLeftPos5);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S8934=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread10251(int [] tdone, int [] ends){
        switch(S8903){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S8820){
          case 0 : 
            if((motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 21, column: 21
              S8820=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 23, column: 5
              currsigs.addElement(motorOff_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 25, column: 10
              S8820=2;
              if((!motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 26, column: 20
                S8820=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("motorOn");//sysj\plantConveyor.sysj line: 27, column: 5
                motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 28, column: 5
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
            if((!motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 26, column: 20
              S8820=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOn_1.setPresent();//sysj\plantConveyor.sysj line: 28, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantConveyor.sysj line: 30, column: 10
              S8820=0;
              if((motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 21, column: 21
                S8820=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("motorOff");//sysj\plantConveyor.sysj line: 22, column: 5
                motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 23, column: 5
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

  public void thread10248(int [] tdone, int [] ends){
        S9161=1;
    if(bottleAtLoad.getprestatus()){//sysj\plantConveyor.sysj line: 106, column: 24
      bottleAtLoadE.setPresent();//sysj\plantConveyor.sysj line: 106, column: 38
      currsigs.addElement(bottleAtLoadE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread10247(int [] tdone, int [] ends){
        S9153=1;
    if(bottleLeftPos5.getprestatus()){//sysj\plantConveyor.sysj line: 104, column: 24
      bottleLeftPos5E.setPresent();//sysj\plantConveyor.sysj line: 104, column: 40
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

  public void thread10246(int [] tdone, int [] ends){
        S9145=1;
    if(bottleAtPos1.getprestatus()){//sysj\plantConveyor.sysj line: 102, column: 24
      bottleAtPos1E.setPresent();//sysj\plantConveyor.sysj line: 102, column: 38
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

  public void thread10245(int [] tdone, int [] ends){
        S9163=1;
    thread10246(tdone,ends);
    thread10247(tdone,ends);
    thread10248(tdone,ends);
    int biggest10249 = 0;
    if(ends[7]>=biggest10249){
      biggest10249=ends[7];
    }
    if(ends[8]>=biggest10249){
      biggest10249=ends[8];
    }
    if(ends[9]>=biggest10249){
      biggest10249=ends[9];
    }
    if(biggest10249 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread10244(int [] tdone, int [] ends){
        S9137=1;
    bottlecount_thread_5 = 100;//sysj\plantConveyor.sysj line: 86, column: 3
    S9080=0;
    if(bottleDec_1.getprestatus()){//sysj\plantConveyor.sysj line: 88, column: 12
      if(bottlecount_thread_5 > 0) {//sysj\plantConveyor.sysj line: 89, column: 5
        bottlecount_thread_5 = bottlecount_thread_5 - 1;//sysj\plantConveyor.sysj line: 90, column: 6
      }
      if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 92, column: 12
        bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 93, column: 5
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
          currsigs.addElement(empty_1);
          S9080=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S9080=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
          currsigs.addElement(empty_1);
          S9080=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S9080=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\plantConveyor.sysj line: 92, column: 12
        bottlecount_thread_5 = 5;//sysj\plantConveyor.sysj line: 93, column: 5
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
          currsigs.addElement(empty_1);
          S9080=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S9080=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
      else {
        if(bottlecount_thread_5 == 0){//sysj\plantConveyor.sysj line: 95, column: 7
          empty_1.setPresent();//sysj\plantConveyor.sysj line: 96, column: 4
          currsigs.addElement(empty_1);
          S9080=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S9080=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
  }

  public void thread10243(int [] tdone, int [] ends){
        S9075=1;
    S9023=0;
    System.out.println("Load");//sysj\plantConveyor.sysj line: 67, column: 6
    bottleAtL_1.setPresent();//sysj\plantConveyor.sysj line: 68, column: 6
    currsigs.addElement(bottleAtL_1);
    S8999=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread10242(int [] tdone, int [] ends){
        S8998=1;
    data_thread_3 = (bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue());//sysj\plantConveyor.sysj line: 36, column: 3
    S8934=0;
    if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 0){//sysj\plantConveyor.sysj line: 37, column: 7
      S8918=0;
      bottleAtLoad.setPresent();//sysj\plantConveyor.sysj line: 39, column: 6
      currsigs.addElement(bottleAtLoad);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S8918=1;
      if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 1){//sysj\plantConveyor.sysj line: 42, column: 12
        S8917=0;
        bottleAtPos1.setPresent();//sysj\plantConveyor.sysj line: 44, column: 6
        currsigs.addElement(bottleAtPos1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        S8917=1;
        if((Integer)(bottlePos_1.getpreval() == null ? 0 : ((Integer)bottlePos_1.getpreval()).intValue()) == 2){//sysj\plantConveyor.sysj line: 47, column: 12
          bottleLeftPos5.setPresent();//sysj\plantConveyor.sysj line: 49, column: 6
          currsigs.addElement(bottleLeftPos5);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S8934=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
    }
  }

  public void thread10241(int [] tdone, int [] ends){
        S8903=1;
    S8820=0;
    if((motConveyorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantConveyor.sysj line: 21, column: 21
      S8820=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      System.out.println("motorOff");//sysj\plantConveyor.sysj line: 22, column: 5
      motorOff_1.setPresent();//sysj\plantConveyor.sysj line: 23, column: 5
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
      switch(S10239){
        case 0 : 
          S10239=0;
          break RUN;
        
        case 1 : 
          S10239=2;
          S10239=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantConveyor.sysj line: 8, column: 1
            public void run() {//sysj\plantConveyor.sysj line: 10, column: 21
              org.compsys704.Conveyor.main(null);//sysj\plantConveyor.sysj line: 11, column: 4
            }
            GUI(){//sysj\plantConveyor.sysj line: 9, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantConveyor.sysj line: 14, column: 2
          bottleDec_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAt1_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAtL_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAt5_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          motorOn_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          motorOff_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          empty_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottlePos_1.setClear();//sysj\plantConveyor.sysj line: 17, column: 2
          bottlePos_1.setPresent();//sysj\plantConveyor.sysj line: 18, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\plantConveyor.sysj line: 18, column: 2
          thread10241(tdone,ends);
          thread10242(tdone,ends);
          thread10243(tdone,ends);
          thread10244(tdone,ends);
          thread10245(tdone,ends);
          int biggest10250 = 0;
          if(ends[2]>=biggest10250){
            biggest10250=ends[2];
          }
          if(ends[3]>=biggest10250){
            biggest10250=ends[3];
          }
          if(ends[4]>=biggest10250){
            biggest10250=ends[4];
          }
          if(ends[5]>=biggest10250){
            biggest10250=ends[5];
          }
          if(ends[6]>=biggest10250){
            biggest10250=ends[6];
          }
          if(biggest10250 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bottleDec_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAt1_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAtL_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottleAt5_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          motorOn_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          motorOff_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          empty_1.setClear();//sysj\plantConveyor.sysj line: 16, column: 2
          bottlePos_1.setClear();//sysj\plantConveyor.sysj line: 17, column: 2
          thread10251(tdone,ends);
          thread10252(tdone,ends);
          thread10253(tdone,ends);
          thread10254(tdone,ends);
          thread10255(tdone,ends);
          int biggest10260 = 0;
          if(ends[2]>=biggest10260){
            biggest10260=ends[2];
          }
          if(ends[3]>=biggest10260){
            biggest10260=ends[3];
          }
          if(ends[4]>=biggest10260){
            biggest10260=ends[4];
          }
          if(ends[5]>=biggest10260){
            biggest10260=ends[5];
          }
          if(ends[6]>=biggest10260){
            biggest10260=ends[6];
          }
          if(biggest10260 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10260 == 0){
            S10239=0;
            active[1]=0;
            ends[1]=0;
            S10239=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleDec_1 = new Signal();
    bottleAt1_1 = new Signal();
    bottleAtL_1 = new Signal();
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
      bottleAtLoad.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtLoadE.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      bottleDec_1.setpreclear();
      bottleAt1_1.setpreclear();
      bottleAtL_1.setpreclear();
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
      bottleAtLoad.sethook();
      bottleAtLoad.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleAtLoadE.sethook();
      bottleAtLoadE.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      bottleDec_1.setClear();
      bottleAt1_1.setClear();
      bottleAtL_1.setClear();
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
