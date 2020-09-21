import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class PlantPOS extends ClockDomain{
  public PlantPOS(String name){super(name);}
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
  private int S15972 = 1;
  private int S15426 = 1;
  private int S15375 = 1;
  private int S15485 = 1;
  private int S15434 = 1;
  private int S15544 = 1;
  private int S15493 = 1;
  private int S15603 = 1;
  private int S15552 = 1;
  private int S15669 = 1;
  private int S15611 = 1;
  private int S15605 = 1;
  private int S15619 = 1;
  private int S15627 = 1;
  private int S15635 = 1;
  private int S15643 = 1;
  private int S15651 = 1;
  private int S15659 = 1;
  private int S15667 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread16001(int [] tdone, int [] ends){
        switch(S15667){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(jobDoneN.getprestatus()){//sysj\plantPOS.sysj line: 83, column: 24
          jobDoneE.setPresent();//sysj\plantPOS.sysj line: 83, column: 34
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

  public void thread16000(int [] tdone, int [] ends){
        switch(S15659){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(inletOff.getprestatus()){//sysj\plantPOS.sysj line: 81, column: 24
          inletOffE.setPresent();//sysj\plantPOS.sysj line: 81, column: 34
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

  public void thread15999(int [] tdone, int [] ends){
        switch(S15651){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(inletOn.getprestatus()){//sysj\plantPOS.sysj line: 79, column: 24
          inletOnE.setPresent();//sysj\plantPOS.sysj line: 79, column: 33
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

  public void thread15998(int [] tdone, int [] ends){
        switch(S15643){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(injectorOff.getprestatus()){//sysj\plantPOS.sysj line: 77, column: 24
          injectorOffE.setPresent();//sysj\plantPOS.sysj line: 77, column: 37
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

  public void thread15997(int [] tdone, int [] ends){
        switch(S15635){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(injectorOn.getprestatus()){//sysj\plantPOS.sysj line: 75, column: 24
          injectorOnE.setPresent();//sysj\plantPOS.sysj line: 75, column: 36
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

  public void thread15996(int [] tdone, int [] ends){
        switch(S15627){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\plantPOS.sysj line: 73, column: 24
          dosUnitFilledE.setPresent();//sysj\plantPOS.sysj line: 73, column: 39
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

  public void thread15995(int [] tdone, int [] ends){
        switch(S15619){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\plantPOS.sysj line: 71, column: 24
          dosUnitEvacE.setPresent();//sysj\plantPOS.sysj line: 71, column: 37
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

  public void thread15994(int [] tdone, int [] ends){
        switch(S15611){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S15605){
          case 0 : 
            S15605=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantPOS.sysj line: 69, column: 24
              bottleAtPos2E.setPresent();//sysj\plantPOS.sysj line: 69, column: 38
              currsigs.addElement(bottleAtPos2E);
              S15605=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S15605=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S15605=1;
            S15605=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantPOS.sysj line: 69, column: 24
              bottleAtPos2E.setPresent();//sysj\plantPOS.sysj line: 69, column: 38
              currsigs.addElement(bottleAtPos2E);
              S15605=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S15605=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15993(int [] tdone, int [] ends){
        switch(S15669){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread15994(tdone,ends);
        thread15995(tdone,ends);
        thread15996(tdone,ends);
        thread15997(tdone,ends);
        thread15998(tdone,ends);
        thread15999(tdone,ends);
        thread16000(tdone,ends);
        thread16001(tdone,ends);
        int biggest16002 = 0;
        if(ends[7]>=biggest16002){
          biggest16002=ends[7];
        }
        if(ends[8]>=biggest16002){
          biggest16002=ends[8];
        }
        if(ends[9]>=biggest16002){
          biggest16002=ends[9];
        }
        if(ends[10]>=biggest16002){
          biggest16002=ends[10];
        }
        if(ends[11]>=biggest16002){
          biggest16002=ends[11];
        }
        if(ends[12]>=biggest16002){
          biggest16002=ends[12];
        }
        if(ends[13]>=biggest16002){
          biggest16002=ends[13];
        }
        if(ends[14]>=biggest16002){
          biggest16002=ends[14];
        }
        if(biggest16002 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest16002 == 0){
          S15669=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread15992(int [] tdone, int [] ends){
        switch(S15603){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S15552){
          case 0 : 
            if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 57, column: 20
              S15552=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plantPOS.sysj line: 58, column: 5
              currsigs.addElement(dosUnitFilled);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 60, column: 10
              S15552=2;
              if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 61, column: 20
                S15552=3;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                dosUnitEvac.setPresent();//sysj\plantPOS.sysj line: 62, column: 5
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
            if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 61, column: 20
              S15552=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plantPOS.sysj line: 62, column: 5
              currsigs.addElement(dosUnitEvac);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 64, column: 10
              S15552=0;
              if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 57, column: 20
                S15552=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                dosUnitFilled.setPresent();//sysj\plantPOS.sysj line: 58, column: 5
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

  public void thread15991(int [] tdone, int [] ends){
        switch(S15544){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S15493){
          case 0 : 
            if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 44, column: 21
              S15493=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              inletOff.setPresent();//sysj\plantPOS.sysj line: 45, column: 5
              currsigs.addElement(inletOff);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 47, column: 10
              S15493=2;
              if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 48, column: 20
                S15493=3;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                inletOn.setPresent();//sysj\plantPOS.sysj line: 49, column: 5
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
            if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 48, column: 20
              S15493=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              inletOn.setPresent();//sysj\plantPOS.sysj line: 49, column: 5
              currsigs.addElement(inletOn);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 51, column: 10
              S15493=0;
              if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 44, column: 21
                S15493=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                inletOff.setPresent();//sysj\plantPOS.sysj line: 45, column: 5
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

  public void thread15990(int [] tdone, int [] ends){
        switch(S15485){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S15434){
          case 0 : 
            if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 31, column: 21
              S15434=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\plantPOS.sysj line: 32, column: 5
              currsigs.addElement(bottleAtPos2);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 34, column: 10
              S15434=2;
              if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 35, column: 21
                S15434=3;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                jobDoneN.setPresent();//sysj\plantPOS.sysj line: 36, column: 5
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
            if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 35, column: 21
              S15434=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              jobDoneN.setPresent();//sysj\plantPOS.sysj line: 36, column: 5
              currsigs.addElement(jobDoneN);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 38, column: 10
              S15434=0;
              if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 31, column: 21
                S15434=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                bottleAtPos2.setPresent();//sysj\plantPOS.sysj line: 32, column: 5
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

  public void thread15989(int [] tdone, int [] ends){
        switch(S15426){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S15375){
          case 0 : 
            if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 18, column: 21
              S15375=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOff.setPresent();//sysj\plantPOS.sysj line: 19, column: 5
              currsigs.addElement(injectorOff);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 21, column: 10
              S15375=2;
              if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 22, column: 20
                S15375=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOn.setPresent();//sysj\plantPOS.sysj line: 23, column: 5
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
            if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 22, column: 20
              S15375=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              injectorOn.setPresent();//sysj\plantPOS.sysj line: 23, column: 5
              currsigs.addElement(injectorOn);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plantPOS.sysj line: 25, column: 10
              S15375=0;
              if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 18, column: 21
                S15375=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                injectorOff.setPresent();//sysj\plantPOS.sysj line: 19, column: 5
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

  public void thread15986(int [] tdone, int [] ends){
        S15667=1;
    if(jobDoneN.getprestatus()){//sysj\plantPOS.sysj line: 83, column: 24
      jobDoneE.setPresent();//sysj\plantPOS.sysj line: 83, column: 34
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

  public void thread15985(int [] tdone, int [] ends){
        S15659=1;
    if(inletOff.getprestatus()){//sysj\plantPOS.sysj line: 81, column: 24
      inletOffE.setPresent();//sysj\plantPOS.sysj line: 81, column: 34
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

  public void thread15984(int [] tdone, int [] ends){
        S15651=1;
    if(inletOn.getprestatus()){//sysj\plantPOS.sysj line: 79, column: 24
      inletOnE.setPresent();//sysj\plantPOS.sysj line: 79, column: 33
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

  public void thread15983(int [] tdone, int [] ends){
        S15643=1;
    if(injectorOff.getprestatus()){//sysj\plantPOS.sysj line: 77, column: 24
      injectorOffE.setPresent();//sysj\plantPOS.sysj line: 77, column: 37
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

  public void thread15982(int [] tdone, int [] ends){
        S15635=1;
    if(injectorOn.getprestatus()){//sysj\plantPOS.sysj line: 75, column: 24
      injectorOnE.setPresent();//sysj\plantPOS.sysj line: 75, column: 36
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

  public void thread15981(int [] tdone, int [] ends){
        S15627=1;
    if(dosUnitFilled.getprestatus()){//sysj\plantPOS.sysj line: 73, column: 24
      dosUnitFilledE.setPresent();//sysj\plantPOS.sysj line: 73, column: 39
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

  public void thread15980(int [] tdone, int [] ends){
        S15619=1;
    if(dosUnitEvac.getprestatus()){//sysj\plantPOS.sysj line: 71, column: 24
      dosUnitEvacE.setPresent();//sysj\plantPOS.sysj line: 71, column: 37
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

  public void thread15979(int [] tdone, int [] ends){
        S15611=1;
    S15605=0;
    if(bottleAtPos2.getprestatus()){//sysj\plantPOS.sysj line: 69, column: 24
      bottleAtPos2E.setPresent();//sysj\plantPOS.sysj line: 69, column: 38
      currsigs.addElement(bottleAtPos2E);
      S15605=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S15605=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread15978(int [] tdone, int [] ends){
        S15669=1;
    thread15979(tdone,ends);
    thread15980(tdone,ends);
    thread15981(tdone,ends);
    thread15982(tdone,ends);
    thread15983(tdone,ends);
    thread15984(tdone,ends);
    thread15985(tdone,ends);
    thread15986(tdone,ends);
    int biggest15987 = 0;
    if(ends[7]>=biggest15987){
      biggest15987=ends[7];
    }
    if(ends[8]>=biggest15987){
      biggest15987=ends[8];
    }
    if(ends[9]>=biggest15987){
      biggest15987=ends[9];
    }
    if(ends[10]>=biggest15987){
      biggest15987=ends[10];
    }
    if(ends[11]>=biggest15987){
      biggest15987=ends[11];
    }
    if(ends[12]>=biggest15987){
      biggest15987=ends[12];
    }
    if(ends[13]>=biggest15987){
      biggest15987=ends[13];
    }
    if(ends[14]>=biggest15987){
      biggest15987=ends[14];
    }
    if(biggest15987 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread15977(int [] tdone, int [] ends){
        S15603=1;
    S15552=0;
    if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 57, column: 20
      S15552=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      dosUnitFilled.setPresent();//sysj\plantPOS.sysj line: 58, column: 5
      currsigs.addElement(dosUnitFilled);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread15976(int [] tdone, int [] ends){
        S15544=1;
    S15493=0;
    if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 44, column: 21
      S15493=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      inletOff.setPresent();//sysj\plantPOS.sysj line: 45, column: 5
      currsigs.addElement(inletOff);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread15975(int [] tdone, int [] ends){
        S15485=1;
    S15434=0;
    if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 31, column: 21
      S15434=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      bottleAtPos2.setPresent();//sysj\plantPOS.sysj line: 32, column: 5
      currsigs.addElement(bottleAtPos2);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread15974(int [] tdone, int [] ends){
        S15426=1;
    S15375=0;
    if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantPOS.sysj line: 18, column: 21
      S15375=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      injectorOff.setPresent();//sysj\plantPOS.sysj line: 19, column: 5
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
      switch(S15972){
        case 0 : 
          S15972=0;
          break RUN;
        
        case 1 : 
          S15972=2;
          S15972=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantPOS.sysj line: 8, column: 1
            public void run() {//sysj\plantPOS.sysj line: 10, column: 21
              org.compsys704.Filler.main(null);//sysj\plantPOS.sysj line: 11, column: 4
            }
            GUI(){//sysj\plantPOS.sysj line: 9, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantPOS.sysj line: 14, column: 2
          thread15974(tdone,ends);
          thread15975(tdone,ends);
          thread15976(tdone,ends);
          thread15977(tdone,ends);
          thread15978(tdone,ends);
          int biggest15988 = 0;
          if(ends[2]>=biggest15988){
            biggest15988=ends[2];
          }
          if(ends[3]>=biggest15988){
            biggest15988=ends[3];
          }
          if(ends[4]>=biggest15988){
            biggest15988=ends[4];
          }
          if(ends[5]>=biggest15988){
            biggest15988=ends[5];
          }
          if(ends[6]>=biggest15988){
            biggest15988=ends[6];
          }
          if(biggest15988 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread15989(tdone,ends);
          thread15990(tdone,ends);
          thread15991(tdone,ends);
          thread15992(tdone,ends);
          thread15993(tdone,ends);
          int biggest16003 = 0;
          if(ends[2]>=biggest16003){
            biggest16003=ends[2];
          }
          if(ends[3]>=biggest16003){
            biggest16003=ends[3];
          }
          if(ends[4]>=biggest16003){
            biggest16003=ends[4];
          }
          if(ends[5]>=biggest16003){
            biggest16003=ends[5];
          }
          if(ends[6]>=biggest16003){
            biggest16003=ends[6];
          }
          if(biggest16003 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest16003 == 0){
            S15972=0;
            active[1]=0;
            ends[1]=0;
            S15972=0;
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
