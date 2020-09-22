import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantFiller extends ClockDomain{
  public PlantFiller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal jobDone = new Signal("jobDone", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal enableFiller = new Signal("enableFiller", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal injectorOn = new Signal("injectorOn", Signal.OUTPUT);
  public Signal injectorOff = new Signal("injectorOff", Signal.OUTPUT);
  public Signal inletOn = new Signal("inletOn", Signal.OUTPUT);
  public Signal inletOff = new Signal("inletOff", Signal.OUTPUT);
  public Signal jobDoneN = new Signal("jobDoneN", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal dosUnitEvacE = new Signal("dosUnitEvacE", Signal.OUTPUT);
  public Signal dosUnitFilledE = new Signal("dosUnitFilledE", Signal.OUTPUT);
  public Signal injectorOnE = new Signal("injectorOnE", Signal.OUTPUT);
  public Signal injectorOffE = new Signal("injectorOffE", Signal.OUTPUT);
  public Signal inletOnE = new Signal("inletOnE", Signal.OUTPUT);
  public Signal inletOffE = new Signal("inletOffE", Signal.OUTPUT);
  public Signal jobDoneE = new Signal("jobDoneE", Signal.OUTPUT);
  private int S16850 = 1;
  private int S16210 = 1;
  private int S16159 = 1;
  private int S16275 = 1;
  private int S16228 = 1;
  private int S16316 = 1;
  private int S16285 = 1;
  private int S16375 = 1;
  private int S16324 = 1;
  private int S16434 = 1;
  private int S16383 = 1;
  private int S16500 = 1;
  private int S16442 = 1;
  private int S16436 = 1;
  private int S16450 = 1;
  private int S16458 = 1;
  private int S16466 = 1;
  private int S16474 = 1;
  private int S16482 = 1;
  private int S16490 = 1;
  private int S16498 = 1;
  
  private int[] ends = new int[16];
  private int[] tdone = new int[16];
  
  public void thread16881(int [] tdone, int [] ends){
        switch(S16498){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(jobDoneN.getprestatus()){//sysj\plantFiller.sysj line: 92, column: 24
          jobDoneE.setPresent();//sysj\plantFiller.sysj line: 92, column: 34
          currsigs.addElement(jobDoneE);
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

  public void thread16880(int [] tdone, int [] ends){
        switch(S16490){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(inletOff.getprestatus()){//sysj\plantFiller.sysj line: 90, column: 24
          inletOffE.setPresent();//sysj\plantFiller.sysj line: 90, column: 34
          currsigs.addElement(inletOffE);
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

  public void thread16879(int [] tdone, int [] ends){
        switch(S16482){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(inletOn.getprestatus()){//sysj\plantFiller.sysj line: 88, column: 24
          inletOnE.setPresent();//sysj\plantFiller.sysj line: 88, column: 33
          currsigs.addElement(inletOnE);
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

  public void thread16878(int [] tdone, int [] ends){
        switch(S16474){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(injectorOff.getprestatus()){//sysj\plantFiller.sysj line: 86, column: 24
          injectorOffE.setPresent();//sysj\plantFiller.sysj line: 86, column: 37
          currsigs.addElement(injectorOffE);
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

  public void thread16877(int [] tdone, int [] ends){
        switch(S16466){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(injectorOn.getprestatus()){//sysj\plantFiller.sysj line: 84, column: 24
          injectorOnE.setPresent();//sysj\plantFiller.sysj line: 84, column: 36
          currsigs.addElement(injectorOnE);
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

  public void thread16876(int [] tdone, int [] ends){
        switch(S16458){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 82, column: 24
          dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 82, column: 39
          currsigs.addElement(dosUnitFilledE);
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

  public void thread16875(int [] tdone, int [] ends){
        switch(S16450){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 80, column: 24
          dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 80, column: 37
          currsigs.addElement(dosUnitEvacE);
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

  public void thread16874(int [] tdone, int [] ends){
        switch(S16442){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S16436){
          case 0 : 
            S16436=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 78, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 78, column: 38
              currsigs.addElement(bottleAtPos2E);
              S16436=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S16436=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S16436=1;
            S16436=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 78, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 78, column: 38
              currsigs.addElement(bottleAtPos2E);
              S16436=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S16436=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread16873(int [] tdone, int [] ends){
        switch(S16500){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread16874(tdone,ends);
        thread16875(tdone,ends);
        thread16876(tdone,ends);
        thread16877(tdone,ends);
        thread16878(tdone,ends);
        thread16879(tdone,ends);
        thread16880(tdone,ends);
        thread16881(tdone,ends);
        int biggest16882 = 0;
        if(ends[8]>=biggest16882){
          biggest16882=ends[8];
        }
        if(ends[9]>=biggest16882){
          biggest16882=ends[9];
        }
        if(ends[10]>=biggest16882){
          biggest16882=ends[10];
        }
        if(ends[11]>=biggest16882){
          biggest16882=ends[11];
        }
        if(ends[12]>=biggest16882){
          biggest16882=ends[12];
        }
        if(ends[13]>=biggest16882){
          biggest16882=ends[13];
        }
        if(ends[14]>=biggest16882){
          biggest16882=ends[14];
        }
        if(ends[15]>=biggest16882){
          biggest16882=ends[15];
        }
        if(biggest16882 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest16882 == 0){
          S16500=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread16872(int [] tdone, int [] ends){
        switch(S16434){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S16383){
          case 0 : 
            if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 66, column: 20
              S16383=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 67, column: 5
              currsigs.addElement(dosUnitFilled);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 69, column: 10
              S16383=2;
              if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 70, column: 20
                S16383=3;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 71, column: 5
                currsigs.addElement(dosUnitEvac);
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
            if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 70, column: 20
              S16383=3;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 71, column: 5
              currsigs.addElement(dosUnitEvac);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 73, column: 10
              S16383=0;
              if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 66, column: 20
                S16383=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 67, column: 5
                currsigs.addElement(dosUnitFilled);
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

  public void thread16871(int [] tdone, int [] ends){
        switch(S16375){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S16324){
          case 0 : 
            if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 53, column: 21
              S16324=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              inletOff.setPresent();//sysj\plantFiller.sysj line: 54, column: 5
              currsigs.addElement(inletOff);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 56, column: 10
              S16324=2;
              if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 57, column: 20
                S16324=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                inletOn.setPresent();//sysj\plantFiller.sysj line: 58, column: 5
                currsigs.addElement(inletOn);
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
            if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 57, column: 20
              S16324=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              inletOn.setPresent();//sysj\plantFiller.sysj line: 58, column: 5
              currsigs.addElement(inletOn);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 60, column: 10
              S16324=0;
              if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 53, column: 21
                S16324=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                inletOff.setPresent();//sysj\plantFiller.sysj line: 54, column: 5
                currsigs.addElement(inletOff);
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
          
        }
        break;
      
    }
  }

  public void thread16870(int [] tdone, int [] ends){
        switch(S16316){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S16285){
          case 0 : 
            if(jobDone.getprestatus()){//sysj\plantFiller.sysj line: 43, column: 10
              S16285=1;
              if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 44, column: 21
                S16285=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                jobDoneN.setPresent();//sysj\plantFiller.sysj line: 45, column: 6
                currsigs.addElement(jobDoneN);
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
          
          case 1 : 
            if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 44, column: 21
              S16285=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              jobDoneN.setPresent();//sysj\plantFiller.sysj line: 45, column: 6
              currsigs.addElement(jobDoneN);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 47, column: 9
              S16285=0;
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

  public void thread16869(int [] tdone, int [] ends){
        switch(S16275){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S16228){
          case 0 : 
            if(enableFiller.getprestatus()){//sysj\plantFiller.sysj line: 32, column: 11
              S16228=1;
              if((!enableFiller.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
                S16228=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                System.out.println("enableFiller");//sysj\plantFiller.sysj line: 34, column: 5
                bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 35, column: 5
                currsigs.addElement(bottleAtPos2);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if((!enableFiller.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 33, column: 21
              S16228=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 35, column: 5
              currsigs.addElement(bottleAtPos2);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 37, column: 9
              S16228=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread16868(int [] tdone, int [] ends){
        switch(S16210){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S16159){
          case 0 : 
            if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 19, column: 21
              S16159=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOff.setPresent();//sysj\plantFiller.sysj line: 20, column: 5
              currsigs.addElement(injectorOff);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 22, column: 10
              S16159=2;
              if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 23, column: 20
                S16159=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOn.setPresent();//sysj\plantFiller.sysj line: 24, column: 5
                currsigs.addElement(injectorOn);
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
            if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 23, column: 20
              S16159=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOn.setPresent();//sysj\plantFiller.sysj line: 24, column: 5
              currsigs.addElement(injectorOn);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 26, column: 10
              S16159=0;
              if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 19, column: 21
                S16159=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOff.setPresent();//sysj\plantFiller.sysj line: 20, column: 5
                currsigs.addElement(injectorOff);
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

  public void thread16865(int [] tdone, int [] ends){
        S16498=1;
    if(jobDoneN.getprestatus()){//sysj\plantFiller.sysj line: 92, column: 24
      jobDoneE.setPresent();//sysj\plantFiller.sysj line: 92, column: 34
      currsigs.addElement(jobDoneE);
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

  public void thread16864(int [] tdone, int [] ends){
        S16490=1;
    if(inletOff.getprestatus()){//sysj\plantFiller.sysj line: 90, column: 24
      inletOffE.setPresent();//sysj\plantFiller.sysj line: 90, column: 34
      currsigs.addElement(inletOffE);
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

  public void thread16863(int [] tdone, int [] ends){
        S16482=1;
    if(inletOn.getprestatus()){//sysj\plantFiller.sysj line: 88, column: 24
      inletOnE.setPresent();//sysj\plantFiller.sysj line: 88, column: 33
      currsigs.addElement(inletOnE);
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

  public void thread16862(int [] tdone, int [] ends){
        S16474=1;
    if(injectorOff.getprestatus()){//sysj\plantFiller.sysj line: 86, column: 24
      injectorOffE.setPresent();//sysj\plantFiller.sysj line: 86, column: 37
      currsigs.addElement(injectorOffE);
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

  public void thread16861(int [] tdone, int [] ends){
        S16466=1;
    if(injectorOn.getprestatus()){//sysj\plantFiller.sysj line: 84, column: 24
      injectorOnE.setPresent();//sysj\plantFiller.sysj line: 84, column: 36
      currsigs.addElement(injectorOnE);
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

  public void thread16860(int [] tdone, int [] ends){
        S16458=1;
    if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 82, column: 24
      dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 82, column: 39
      currsigs.addElement(dosUnitFilledE);
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

  public void thread16859(int [] tdone, int [] ends){
        S16450=1;
    if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 80, column: 24
      dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 80, column: 37
      currsigs.addElement(dosUnitEvacE);
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

  public void thread16858(int [] tdone, int [] ends){
        S16442=1;
    S16436=0;
    if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 78, column: 24
      bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 78, column: 38
      currsigs.addElement(bottleAtPos2E);
      S16436=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S16436=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread16857(int [] tdone, int [] ends){
        S16500=1;
    thread16858(tdone,ends);
    thread16859(tdone,ends);
    thread16860(tdone,ends);
    thread16861(tdone,ends);
    thread16862(tdone,ends);
    thread16863(tdone,ends);
    thread16864(tdone,ends);
    thread16865(tdone,ends);
    int biggest16866 = 0;
    if(ends[8]>=biggest16866){
      biggest16866=ends[8];
    }
    if(ends[9]>=biggest16866){
      biggest16866=ends[9];
    }
    if(ends[10]>=biggest16866){
      biggest16866=ends[10];
    }
    if(ends[11]>=biggest16866){
      biggest16866=ends[11];
    }
    if(ends[12]>=biggest16866){
      biggest16866=ends[12];
    }
    if(ends[13]>=biggest16866){
      biggest16866=ends[13];
    }
    if(ends[14]>=biggest16866){
      biggest16866=ends[14];
    }
    if(ends[15]>=biggest16866){
      biggest16866=ends[15];
    }
    if(biggest16866 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread16856(int [] tdone, int [] ends){
        S16434=1;
    S16383=0;
    if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 66, column: 20
      S16383=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 67, column: 5
      currsigs.addElement(dosUnitFilled);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread16855(int [] tdone, int [] ends){
        S16375=1;
    S16324=0;
    if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 53, column: 21
      S16324=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      inletOff.setPresent();//sysj\plantFiller.sysj line: 54, column: 5
      currsigs.addElement(inletOff);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread16854(int [] tdone, int [] ends){
        S16316=1;
    S16285=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread16853(int [] tdone, int [] ends){
        S16275=1;
    S16228=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread16852(int [] tdone, int [] ends){
        S16210=1;
    S16159=0;
    if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 19, column: 21
      S16159=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      injectorOff.setPresent();//sysj\plantFiller.sysj line: 20, column: 5
      currsigs.addElement(injectorOff);
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
      switch(S16850){
        case 0 : 
          S16850=0;
          break RUN;
        
        case 1 : 
          S16850=2;
          S16850=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantFiller.sysj line: 9, column: 1
            public void run() {//sysj\plantFiller.sysj line: 11, column: 21
              org.compsys704.Filler.main(null);//sysj\plantFiller.sysj line: 12, column: 4
            }
            GUI(){//sysj\plantFiller.sysj line: 10, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantFiller.sysj line: 15, column: 2
          thread16852(tdone,ends);
          thread16853(tdone,ends);
          thread16854(tdone,ends);
          thread16855(tdone,ends);
          thread16856(tdone,ends);
          thread16857(tdone,ends);
          int biggest16867 = 0;
          if(ends[2]>=biggest16867){
            biggest16867=ends[2];
          }
          if(ends[3]>=biggest16867){
            biggest16867=ends[3];
          }
          if(ends[4]>=biggest16867){
            biggest16867=ends[4];
          }
          if(ends[5]>=biggest16867){
            biggest16867=ends[5];
          }
          if(ends[6]>=biggest16867){
            biggest16867=ends[6];
          }
          if(ends[7]>=biggest16867){
            biggest16867=ends[7];
          }
          if(biggest16867 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread16868(tdone,ends);
          thread16869(tdone,ends);
          thread16870(tdone,ends);
          thread16871(tdone,ends);
          thread16872(tdone,ends);
          thread16873(tdone,ends);
          int biggest16883 = 0;
          if(ends[2]>=biggest16883){
            biggest16883=ends[2];
          }
          if(ends[3]>=biggest16883){
            biggest16883=ends[3];
          }
          if(ends[4]>=biggest16883){
            biggest16883=ends[4];
          }
          if(ends[5]>=biggest16883){
            biggest16883=ends[5];
          }
          if(ends[6]>=biggest16883){
            biggest16883=ends[6];
          }
          if(ends[7]>=biggest16883){
            biggest16883=ends[7];
          }
          if(biggest16883 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest16883 == 0){
            S16850=0;
            active[1]=0;
            ends[1]=0;
            S16850=0;
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
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          jobDone.gethook();
          enable.gethook();
          enableFiller.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      jobDone.setpreclear();
      enable.setpreclear();
      enableFiller.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      injectorOn.setpreclear();
      injectorOff.setpreclear();
      inletOn.setpreclear();
      inletOff.setpreclear();
      jobDoneN.setpreclear();
      bottleAtPos2E.setpreclear();
      dosUnitEvacE.setpreclear();
      dosUnitFilledE.setpreclear();
      injectorOnE.setpreclear();
      injectorOffE.setpreclear();
      inletOnE.setpreclear();
      inletOffE.setpreclear();
      jobDoneE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      dummyint = jobDone.getStatus() ? jobDone.setprepresent() : jobDone.setpreclear();
      jobDone.setpreval(jobDone.getValue());
      jobDone.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = enableFiller.getStatus() ? enableFiller.setprepresent() : enableFiller.setpreclear();
      enableFiller.setpreval(enableFiller.getValue());
      enableFiller.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      injectorOn.sethook();
      injectorOn.setClear();
      injectorOff.sethook();
      injectorOff.setClear();
      inletOn.sethook();
      inletOn.setClear();
      inletOff.sethook();
      inletOff.setClear();
      jobDoneN.sethook();
      jobDoneN.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      dosUnitEvacE.sethook();
      dosUnitEvacE.setClear();
      dosUnitFilledE.sethook();
      dosUnitFilledE.setClear();
      injectorOnE.sethook();
      injectorOnE.setClear();
      injectorOffE.sethook();
      injectorOffE.setClear();
      inletOnE.sethook();
      inletOnE.setClear();
      inletOffE.sethook();
      inletOffE.setClear();
      jobDoneE.sethook();
      jobDoneE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        jobDone.gethook();
        enable.gethook();
        enableFiller.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
