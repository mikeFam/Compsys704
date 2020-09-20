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
  private int S15770 = 1;
  private int S15224 = 1;
  private int S15173 = 1;
  private int S15283 = 1;
  private int S15232 = 1;
  private int S15342 = 1;
  private int S15291 = 1;
  private int S15401 = 1;
  private int S15350 = 1;
  private int S15467 = 1;
  private int S15409 = 1;
  private int S15403 = 1;
  private int S15417 = 1;
  private int S15425 = 1;
  private int S15433 = 1;
  private int S15441 = 1;
  private int S15449 = 1;
  private int S15457 = 1;
  private int S15465 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread15799(int [] tdone, int [] ends){
        switch(S15465){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(jobDoneN.getprestatus()){//sysj\plantFiller.sysj line: 83, column: 24
          jobDoneE.setPresent();//sysj\plantFiller.sysj line: 83, column: 34
          currsigs.addElement(jobDoneE);
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

  public void thread15798(int [] tdone, int [] ends){
        switch(S15457){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(inletOff.getprestatus()){//sysj\plantFiller.sysj line: 81, column: 24
          inletOffE.setPresent();//sysj\plantFiller.sysj line: 81, column: 34
          currsigs.addElement(inletOffE);
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

  public void thread15797(int [] tdone, int [] ends){
        switch(S15449){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(inletOn.getprestatus()){//sysj\plantFiller.sysj line: 79, column: 24
          inletOnE.setPresent();//sysj\plantFiller.sysj line: 79, column: 33
          currsigs.addElement(inletOnE);
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

  public void thread15796(int [] tdone, int [] ends){
        switch(S15441){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(injectorOff.getprestatus()){//sysj\plantFiller.sysj line: 77, column: 24
          injectorOffE.setPresent();//sysj\plantFiller.sysj line: 77, column: 37
          currsigs.addElement(injectorOffE);
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

  public void thread15795(int [] tdone, int [] ends){
        switch(S15433){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(injectorOn.getprestatus()){//sysj\plantFiller.sysj line: 75, column: 24
          injectorOnE.setPresent();//sysj\plantFiller.sysj line: 75, column: 36
          currsigs.addElement(injectorOnE);
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

  public void thread15794(int [] tdone, int [] ends){
        switch(S15425){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 73, column: 24
          dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 73, column: 39
          currsigs.addElement(dosUnitFilledE);
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

  public void thread15793(int [] tdone, int [] ends){
        switch(S15417){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 71, column: 24
          dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 71, column: 37
          currsigs.addElement(dosUnitEvacE);
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

  public void thread15792(int [] tdone, int [] ends){
        switch(S15409){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S15403){
          case 0 : 
            S15403=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 69, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 69, column: 38
              currsigs.addElement(bottleAtPos2E);
              S15403=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S15403=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S15403=1;
            S15403=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 69, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 69, column: 38
              currsigs.addElement(bottleAtPos2E);
              S15403=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S15403=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15791(int [] tdone, int [] ends){
        switch(S15467){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread15792(tdone,ends);
        thread15793(tdone,ends);
        thread15794(tdone,ends);
        thread15795(tdone,ends);
        thread15796(tdone,ends);
        thread15797(tdone,ends);
        thread15798(tdone,ends);
        thread15799(tdone,ends);
        int biggest15800 = 0;
        if(ends[7]>=biggest15800){
          biggest15800=ends[7];
        }
        if(ends[8]>=biggest15800){
          biggest15800=ends[8];
        }
        if(ends[9]>=biggest15800){
          biggest15800=ends[9];
        }
        if(ends[10]>=biggest15800){
          biggest15800=ends[10];
        }
        if(ends[11]>=biggest15800){
          biggest15800=ends[11];
        }
        if(ends[12]>=biggest15800){
          biggest15800=ends[12];
        }
        if(ends[13]>=biggest15800){
          biggest15800=ends[13];
        }
        if(ends[14]>=biggest15800){
          biggest15800=ends[14];
        }
        if(biggest15800 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest15800 == 0){
          S15467=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread15790(int [] tdone, int [] ends){
        switch(S15401){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S15350){
          case 0 : 
            if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 57, column: 20
              S15350=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 58, column: 5
              currsigs.addElement(dosUnitFilled);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 60, column: 10
              S15350=2;
              if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 61, column: 20
                S15350=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 62, column: 5
                currsigs.addElement(dosUnitEvac);
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
            if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 61, column: 20
              S15350=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plantFiller.sysj line: 62, column: 5
              currsigs.addElement(dosUnitEvac);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 64, column: 10
              S15350=0;
              if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 57, column: 20
                S15350=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 58, column: 5
                currsigs.addElement(dosUnitFilled);
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

  public void thread15789(int [] tdone, int [] ends){
        switch(S15342){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S15291){
          case 0 : 
            if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 44, column: 21
              S15291=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              inletOff.setPresent();//sysj\plantFiller.sysj line: 45, column: 5
              currsigs.addElement(inletOff);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 47, column: 10
              S15291=2;
              if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 48, column: 20
                S15291=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                inletOn.setPresent();//sysj\plantFiller.sysj line: 49, column: 5
                currsigs.addElement(inletOn);
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
            if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 48, column: 20
              S15291=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              inletOn.setPresent();//sysj\plantFiller.sysj line: 49, column: 5
              currsigs.addElement(inletOn);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 51, column: 10
              S15291=0;
              if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 44, column: 21
                S15291=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                inletOff.setPresent();//sysj\plantFiller.sysj line: 45, column: 5
                currsigs.addElement(inletOff);
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
          
        }
        break;
      
    }
  }

  public void thread15788(int [] tdone, int [] ends){
        switch(S15283){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S15232){
          case 0 : 
            if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 31, column: 21
              S15232=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 32, column: 5
              currsigs.addElement(bottleAtPos2);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 34, column: 10
              S15232=2;
              if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 35, column: 21
                S15232=3;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                jobDoneN.setPresent();//sysj\plantFiller.sysj line: 36, column: 5
                currsigs.addElement(jobDoneN);
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
          
          case 2 : 
            if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 35, column: 21
              S15232=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              jobDoneN.setPresent();//sysj\plantFiller.sysj line: 36, column: 5
              currsigs.addElement(jobDoneN);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 38, column: 10
              S15232=0;
              if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 31, column: 21
                S15232=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 32, column: 5
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
          
        }
        break;
      
    }
  }

  public void thread15787(int [] tdone, int [] ends){
        switch(S15224){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S15173){
          case 0 : 
            if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 18, column: 21
              S15173=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOff.setPresent();//sysj\plantFiller.sysj line: 19, column: 5
              currsigs.addElement(injectorOff);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 21, column: 10
              S15173=2;
              if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 22, column: 20
                S15173=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOn.setPresent();//sysj\plantFiller.sysj line: 23, column: 5
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
            if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 22, column: 20
              S15173=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOn.setPresent();//sysj\plantFiller.sysj line: 23, column: 5
              currsigs.addElement(injectorOn);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantFiller.sysj line: 25, column: 10
              S15173=0;
              if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 18, column: 21
                S15173=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOff.setPresent();//sysj\plantFiller.sysj line: 19, column: 5
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

  public void thread15784(int [] tdone, int [] ends){
        S15465=1;
    if(jobDoneN.getprestatus()){//sysj\plantFiller.sysj line: 83, column: 24
      jobDoneE.setPresent();//sysj\plantFiller.sysj line: 83, column: 34
      currsigs.addElement(jobDoneE);
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

  public void thread15783(int [] tdone, int [] ends){
        S15457=1;
    if(inletOff.getprestatus()){//sysj\plantFiller.sysj line: 81, column: 24
      inletOffE.setPresent();//sysj\plantFiller.sysj line: 81, column: 34
      currsigs.addElement(inletOffE);
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

  public void thread15782(int [] tdone, int [] ends){
        S15449=1;
    if(inletOn.getprestatus()){//sysj\plantFiller.sysj line: 79, column: 24
      inletOnE.setPresent();//sysj\plantFiller.sysj line: 79, column: 33
      currsigs.addElement(inletOnE);
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

  public void thread15781(int [] tdone, int [] ends){
        S15441=1;
    if(injectorOff.getprestatus()){//sysj\plantFiller.sysj line: 77, column: 24
      injectorOffE.setPresent();//sysj\plantFiller.sysj line: 77, column: 37
      currsigs.addElement(injectorOffE);
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

  public void thread15780(int [] tdone, int [] ends){
        S15433=1;
    if(injectorOn.getprestatus()){//sysj\plantFiller.sysj line: 75, column: 24
      injectorOnE.setPresent();//sysj\plantFiller.sysj line: 75, column: 36
      currsigs.addElement(injectorOnE);
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

  public void thread15779(int [] tdone, int [] ends){
        S15425=1;
    if(dosUnitFilled.getprestatus()){//sysj\plantFiller.sysj line: 73, column: 24
      dosUnitFilledE.setPresent();//sysj\plantFiller.sysj line: 73, column: 39
      currsigs.addElement(dosUnitFilledE);
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

  public void thread15778(int [] tdone, int [] ends){
        S15417=1;
    if(dosUnitEvac.getprestatus()){//sysj\plantFiller.sysj line: 71, column: 24
      dosUnitEvacE.setPresent();//sysj\plantFiller.sysj line: 71, column: 37
      currsigs.addElement(dosUnitEvacE);
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

  public void thread15777(int [] tdone, int [] ends){
        S15409=1;
    S15403=0;
    if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 69, column: 24
      bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 69, column: 38
      currsigs.addElement(bottleAtPos2E);
      S15403=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S15403=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread15776(int [] tdone, int [] ends){
        S15467=1;
    thread15777(tdone,ends);
    thread15778(tdone,ends);
    thread15779(tdone,ends);
    thread15780(tdone,ends);
    thread15781(tdone,ends);
    thread15782(tdone,ends);
    thread15783(tdone,ends);
    thread15784(tdone,ends);
    int biggest15785 = 0;
    if(ends[7]>=biggest15785){
      biggest15785=ends[7];
    }
    if(ends[8]>=biggest15785){
      biggest15785=ends[8];
    }
    if(ends[9]>=biggest15785){
      biggest15785=ends[9];
    }
    if(ends[10]>=biggest15785){
      biggest15785=ends[10];
    }
    if(ends[11]>=biggest15785){
      biggest15785=ends[11];
    }
    if(ends[12]>=biggest15785){
      biggest15785=ends[12];
    }
    if(ends[13]>=biggest15785){
      biggest15785=ends[13];
    }
    if(ends[14]>=biggest15785){
      biggest15785=ends[14];
    }
    if(biggest15785 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread15775(int [] tdone, int [] ends){
        S15401=1;
    S15350=0;
    if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 57, column: 20
      S15350=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      dosUnitFilled.setPresent();//sysj\plantFiller.sysj line: 58, column: 5
      currsigs.addElement(dosUnitFilled);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread15774(int [] tdone, int [] ends){
        S15342=1;
    S15291=0;
    if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 44, column: 21
      S15291=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      inletOff.setPresent();//sysj\plantFiller.sysj line: 45, column: 5
      currsigs.addElement(inletOff);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread15773(int [] tdone, int [] ends){
        S15283=1;
    S15232=0;
    if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 31, column: 21
      S15232=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      bottleAtPos2.setPresent();//sysj\plantFiller.sysj line: 32, column: 5
      currsigs.addElement(bottleAtPos2);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread15772(int [] tdone, int [] ends){
        S15224=1;
    S15173=0;
    if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 18, column: 21
      S15173=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      injectorOff.setPresent();//sysj\plantFiller.sysj line: 19, column: 5
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
      switch(S15770){
        case 0 : 
          S15770=0;
          break RUN;
        
        case 1 : 
          S15770=2;
          S15770=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantFiller.sysj line: 8, column: 1
            public void run() {//sysj\plantFiller.sysj line: 10, column: 21
              org.compsys704.Filler.main(null);//sysj\plantFiller.sysj line: 11, column: 4
            }
            GUI(){//sysj\plantFiller.sysj line: 9, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantFiller.sysj line: 14, column: 2
          thread15772(tdone,ends);
          thread15773(tdone,ends);
          thread15774(tdone,ends);
          thread15775(tdone,ends);
          thread15776(tdone,ends);
          int biggest15786 = 0;
          if(ends[2]>=biggest15786){
            biggest15786=ends[2];
          }
          if(ends[3]>=biggest15786){
            biggest15786=ends[3];
          }
          if(ends[4]>=biggest15786){
            biggest15786=ends[4];
          }
          if(ends[5]>=biggest15786){
            biggest15786=ends[5];
          }
          if(ends[6]>=biggest15786){
            biggest15786=ends[6];
          }
          if(biggest15786 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread15787(tdone,ends);
          thread15788(tdone,ends);
          thread15789(tdone,ends);
          thread15790(tdone,ends);
          thread15791(tdone,ends);
          int biggest15801 = 0;
          if(ends[2]>=biggest15801){
            biggest15801=ends[2];
          }
          if(ends[3]>=biggest15801){
            biggest15801=ends[3];
          }
          if(ends[4]>=biggest15801){
            biggest15801=ends[4];
          }
          if(ends[5]>=biggest15801){
            biggest15801=ends[5];
          }
          if(ends[6]>=biggest15801){
            biggest15801=ends[6];
          }
          if(biggest15801 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest15801 == 0){
            S15770=0;
            active[1]=0;
            ends[1]=0;
            S15770=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
