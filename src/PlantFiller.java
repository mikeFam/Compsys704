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
  private int S15536 = 1;
  private int S14990 = 1;
  private int S14939 = 1;
  private int S15049 = 1;
  private int S14998 = 1;
  private int S15108 = 1;
  private int S15057 = 1;
  private int S15167 = 1;
  private int S15116 = 1;
  private int S15233 = 1;
  private int S15175 = 1;
  private int S15169 = 1;
  private int S15183 = 1;
  private int S15191 = 1;
  private int S15199 = 1;
  private int S15207 = 1;
  private int S15215 = 1;
  private int S15223 = 1;
  private int S15231 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread15565(int [] tdone, int [] ends){
        switch(S15231){
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

  public void thread15564(int [] tdone, int [] ends){
        switch(S15223){
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

  public void thread15563(int [] tdone, int [] ends){
        switch(S15215){
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

  public void thread15562(int [] tdone, int [] ends){
        switch(S15207){
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

  public void thread15561(int [] tdone, int [] ends){
        switch(S15199){
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

  public void thread15560(int [] tdone, int [] ends){
        switch(S15191){
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

  public void thread15559(int [] tdone, int [] ends){
        switch(S15183){
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

  public void thread15558(int [] tdone, int [] ends){
        switch(S15175){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S15169){
          case 0 : 
            S15169=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 69, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 69, column: 38
              currsigs.addElement(bottleAtPos2E);
              S15169=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S15169=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S15169=1;
            S15169=0;
            if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 69, column: 24
              bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 69, column: 38
              currsigs.addElement(bottleAtPos2E);
              S15169=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S15169=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15557(int [] tdone, int [] ends){
        switch(S15233){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread15558(tdone,ends);
        thread15559(tdone,ends);
        thread15560(tdone,ends);
        thread15561(tdone,ends);
        thread15562(tdone,ends);
        thread15563(tdone,ends);
        thread15564(tdone,ends);
        thread15565(tdone,ends);
        int biggest15566 = 0;
        if(ends[7]>=biggest15566){
          biggest15566=ends[7];
        }
        if(ends[8]>=biggest15566){
          biggest15566=ends[8];
        }
        if(ends[9]>=biggest15566){
          biggest15566=ends[9];
        }
        if(ends[10]>=biggest15566){
          biggest15566=ends[10];
        }
        if(ends[11]>=biggest15566){
          biggest15566=ends[11];
        }
        if(ends[12]>=biggest15566){
          biggest15566=ends[12];
        }
        if(ends[13]>=biggest15566){
          biggest15566=ends[13];
        }
        if(ends[14]>=biggest15566){
          biggest15566=ends[14];
        }
        if(biggest15566 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest15566 == 0){
          S15233=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread15556(int [] tdone, int [] ends){
        switch(S15167){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S15116){
          case 0 : 
            if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 57, column: 20
              S15116=1;
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
              S15116=2;
              if((dosUnitValveRetract.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 61, column: 20
                S15116=3;
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
              S15116=3;
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
              S15116=0;
              if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 57, column: 20
                S15116=1;
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

  public void thread15555(int [] tdone, int [] ends){
        switch(S15108){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S15057){
          case 0 : 
            if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 44, column: 21
              S15057=1;
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
              S15057=2;
              if((!valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 48, column: 20
                S15057=3;
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
              S15057=3;
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
              S15057=0;
              if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 44, column: 21
                S15057=1;
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

  public void thread15554(int [] tdone, int [] ends){
        switch(S15049){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S14998){
          case 0 : 
            if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 31, column: 21
              S14998=1;
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
              S14998=2;
              if((!jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 35, column: 21
                S14998=3;
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
              S14998=3;
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
              S14998=0;
              if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 31, column: 21
                S14998=1;
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

  public void thread15553(int [] tdone, int [] ends){
        switch(S14990){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S14939){
          case 0 : 
            if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 18, column: 21
              S14939=1;
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
              S14939=2;
              if((!valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 22, column: 20
                S14939=3;
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
              S14939=3;
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
              S14939=0;
              if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 18, column: 21
                S14939=1;
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

  public void thread15550(int [] tdone, int [] ends){
        S15231=1;
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

  public void thread15549(int [] tdone, int [] ends){
        S15223=1;
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

  public void thread15548(int [] tdone, int [] ends){
        S15215=1;
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

  public void thread15547(int [] tdone, int [] ends){
        S15207=1;
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

  public void thread15546(int [] tdone, int [] ends){
        S15199=1;
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

  public void thread15545(int [] tdone, int [] ends){
        S15191=1;
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

  public void thread15544(int [] tdone, int [] ends){
        S15183=1;
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

  public void thread15543(int [] tdone, int [] ends){
        S15175=1;
    S15169=0;
    if(bottleAtPos2.getprestatus()){//sysj\plantFiller.sysj line: 69, column: 24
      bottleAtPos2E.setPresent();//sysj\plantFiller.sysj line: 69, column: 38
      currsigs.addElement(bottleAtPos2E);
      S15169=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S15169=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread15542(int [] tdone, int [] ends){
        S15233=1;
    thread15543(tdone,ends);
    thread15544(tdone,ends);
    thread15545(tdone,ends);
    thread15546(tdone,ends);
    thread15547(tdone,ends);
    thread15548(tdone,ends);
    thread15549(tdone,ends);
    thread15550(tdone,ends);
    int biggest15551 = 0;
    if(ends[7]>=biggest15551){
      biggest15551=ends[7];
    }
    if(ends[8]>=biggest15551){
      biggest15551=ends[8];
    }
    if(ends[9]>=biggest15551){
      biggest15551=ends[9];
    }
    if(ends[10]>=biggest15551){
      biggest15551=ends[10];
    }
    if(ends[11]>=biggest15551){
      biggest15551=ends[11];
    }
    if(ends[12]>=biggest15551){
      biggest15551=ends[12];
    }
    if(ends[13]>=biggest15551){
      biggest15551=ends[13];
    }
    if(ends[14]>=biggest15551){
      biggest15551=ends[14];
    }
    if(biggest15551 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread15541(int [] tdone, int [] ends){
        S15167=1;
    S15116=0;
    if((dosUnitValveExtend.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 57, column: 20
      S15116=1;
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

  public void thread15540(int [] tdone, int [] ends){
        S15108=1;
    S15057=0;
    if((valveInletOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 44, column: 21
      S15057=1;
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

  public void thread15539(int [] tdone, int [] ends){
        S15049=1;
    S14998=0;
    if((jobDone.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 31, column: 21
      S14998=1;
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

  public void thread15538(int [] tdone, int [] ends){
        S14990=1;
    S14939=0;
    if((valveInjectorOnOff.getprestatus() && enable.getprestatus())){//sysj\plantFiller.sysj line: 18, column: 21
      S14939=1;
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
      switch(S15536){
        case 0 : 
          S15536=0;
          break RUN;
        
        case 1 : 
          S15536=2;
          S15536=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\plantFiller.sysj line: 8, column: 1
            public void run() {//sysj\plantFiller.sysj line: 10, column: 21
              org.compsys704.Filler.main(null);//sysj\plantFiller.sysj line: 11, column: 4
            }
            GUI(){//sysj\plantFiller.sysj line: 9, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\plantFiller.sysj line: 14, column: 2
          thread15538(tdone,ends);
          thread15539(tdone,ends);
          thread15540(tdone,ends);
          thread15541(tdone,ends);
          thread15542(tdone,ends);
          int biggest15552 = 0;
          if(ends[2]>=biggest15552){
            biggest15552=ends[2];
          }
          if(ends[3]>=biggest15552){
            biggest15552=ends[3];
          }
          if(ends[4]>=biggest15552){
            biggest15552=ends[4];
          }
          if(ends[5]>=biggest15552){
            biggest15552=ends[5];
          }
          if(ends[6]>=biggest15552){
            biggest15552=ends[6];
          }
          if(biggest15552 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread15553(tdone,ends);
          thread15554(tdone,ends);
          thread15555(tdone,ends);
          thread15556(tdone,ends);
          thread15557(tdone,ends);
          int biggest15567 = 0;
          if(ends[2]>=biggest15567){
            biggest15567=ends[2];
          }
          if(ends[3]>=biggest15567){
            biggest15567=ends[3];
          }
          if(ends[4]>=biggest15567){
            biggest15567=ends[4];
          }
          if(ends[5]>=biggest15567){
            biggest15567=ends[5];
          }
          if(ends[6]>=biggest15567){
            biggest15567=ends[6];
          }
          if(biggest15567 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest15567 == 0){
            S15536=0;
            active[1]=0;
            ends[1]=0;
            S15536=0;
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
