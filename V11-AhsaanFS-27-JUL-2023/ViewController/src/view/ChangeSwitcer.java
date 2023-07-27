package view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.controller.ControllerContext;
import oracle.adf.controller.ViewPortContext;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichMenuBar;
import oracle.adf.view.rich.component.rich.RichNoteWindow;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.layout.RichToolbox;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;
import oracle.adf.view.rich.component.rich.nav.RichGoMenuItem;
import oracle.adf.view.rich.component.rich.nav.RichLink;

import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import org.apache.myfaces.trinidad.component.UIXSwitcher;
import org.apache.myfaces.trinidad.context.RequestContext;


public class ChangeSwitcer {
    public ChangeSwitcer() {
        super();
    }
    private RichPageTemplate pt1;
    private RichDecorativeBox db1;
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private String facetname;
    private UIXSwitcher Switcher;
    private RichPopup p1;
    private RichNoteWindow nw1;
    
    private RichShowDetailItem pane1;
    private RichPanelAccordion pa1;
    private RichMenuBar mb1;
    private RichMenuBar mb2;
    private RichCommandMenuItem cmi1;
    private RichCommandMenuItem cmi2;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichButton b4;
    private RichGoMenuItem gmi1;
    private RichToolbox t1;
    private RichToolbar t2;
    private RichOutputText ot1;
        

    
    private RichShowDetailItem sdi1;
    private RichShowDetailItem sdi2;
    private RichShowDetailItem sdi3;
    private RichShowDetailItem sdi4;
    private RichShowDetailItem sdi5;
    private RichShowDetailItem sdi6;
    private RichShowDetailItem sdi7;
    private RichShowDetailItem sdi8;
    private RichShowDetailItem sdi9;
    private RichShowDetailItem sdi10;
    private RichShowDetailItem sdi11;
    private RichShowDetailItem sdi12;
    private RichShowDetailItem sdi13;
    private RichShowDetailItem sdi14;
        
    private RichRegion r1;
    private RichRegion r2;
    private RichRegion r3;
    private RichRegion r4;
    private RichRegion r5;   
    private RichRegion r6;
    private RichRegion r7;
    private RichRegion r8;
    private RichRegion r9;
    private RichRegion r10;
    private RichRegion r11;
    private RichRegion r12;
    private RichRegion r13;   
    private RichRegion r14;
    private RichRegion r15;    
    private RichRegion r16;
    private RichRegion r17;
    private RichRegion r18;
    private RichRegion r19;
    private RichRegion r20;
    private RichRegion r21;
    private RichRegion r22;
    private RichRegion r23;
    private RichRegion r24;
    private RichRegion r25;
    private RichRegion r26;
    private RichRegion r28;
    private RichRegion r29;
    private RichRegion r30;
    private RichRegion r31;
    private RichRegion r32;
    private RichRegion r33;
        
    private RichLink l1;
    private RichLink l2;
    private RichLink l3;
    private RichLink l4;
    private RichLink l5;
    private RichLink l6;
    private RichLink l7;
    private RichLink l8;
    private RichLink l9;
    private RichLink l10;
    private RichLink l11;
    private RichLink l12;
    private RichLink l13;
    private RichLink l14;
    private RichLink l15;
    private RichLink l16;
    private RichLink l17;
    private RichLink l18;
    private RichLink l19;
    private RichLink l20;
    private RichLink l21;
    private RichLink l22;
    private RichLink l23;
    private RichLink l24;
    private RichLink l25;
    private RichLink l26;
    private RichLink l27;
    private RichLink l28;
    private RichLink l29;
    private RichLink l30;
    private RichLink l31;
    private RichLink l32;
    private RichLink l33;
    private RichLink l34;
    
    public void setPt1(RichPageTemplate pt1) { this.pt1 = pt1; }
    public RichPageTemplate getPt1() { return pt1; }
    
    public void setDb1(RichDecorativeBox db1) { this.db1 = db1; }
    public RichDecorativeBox getDb1() { return db1; }
    
    public void setF1(RichForm f1) { this.f1 = f1; }
    public RichForm getF1() { return f1; }
    
    public void setM1(RichMessages m1) { this.m1 = m1; }
    public RichMessages getM1() { return m1; }
    
    public void setD1(RichDocument d1) { this.d1 = d1; }
    public RichDocument getD1() { return d1; }
       
    public void setPane1(RichShowDetailItem pane1) { this.pane1 = pane1; }
    public RichShowDetailItem getPane1() { return pane1; }
    
    public void setPa1(RichPanelAccordion pa1) { this.pa1 = pa1; }
    public RichPanelAccordion getPa1() { return pa1; }
    
    public void setMb1(RichMenuBar mb1) { this.mb1 = mb1; }
    public RichMenuBar getMb1() { return mb1; }
    
    public void setMb2(RichMenuBar mb2) { this.mb2 = mb2; }
    public RichMenuBar getMb2() { return mb2; }
    
    public void setCmi1(RichCommandMenuItem cmi1) { this.cmi1 = cmi1; } 
    public RichCommandMenuItem getCmi1() { return this.cmi1; }
    
    public void setCmi2(RichCommandMenuItem cmi2) { this.cmi2 = cmi2; }      
    public RichCommandMenuItem getCmi2() { return this.cmi2; }

    public void setB1(RichButton b1) { this.b1 = b1; }
    public RichButton getB1() { return this.b1; }

    public void setB2(RichButton b2) { this.b2 = b2; }      
    public RichButton getB2() { return this.b2; }
      
    public void setB3(RichButton b3) { this.b3 = b3; }
    public RichButton getB3() { return this.b3; }
      
    public void setB4(RichButton b4) { this.b4 = b4; }      
    public RichButton getB4() { return this.b4; }
    
    public void setGmi1(RichGoMenuItem gmi1) { this.gmi1 = gmi1; }     
    public RichGoMenuItem getGmi1() { return this.gmi1; }
    
    public void setT1(RichToolbox t1) { this.t1 = t1; }     
    public RichToolbox getT1() { return this.t1; }
     
    public void setT2(RichToolbar t2) { this.t2 = t2; }      
    public RichToolbar getT2() { return this.t2; }
    
    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setNw1(RichNoteWindow nw1) {
        this.nw1 = nw1;
    }

    public RichNoteWindow getNw1() {
        return nw1;
    }
    
    
    
    
    
    
    
    
    /*------------------------------RichShowDetailItem--------------------------------------------*/
    
    
    
    
    
    
    
    
    
    
    
    public void setSdi1(RichShowDetailItem sdi1) { this.sdi1 = sdi1; }
    public RichShowDetailItem getSdi1() { return this.sdi1; }
    
    public void setSdi2(RichShowDetailItem sdi2) { this.sdi2 = sdi2; }
    public RichShowDetailItem getSdi2() { return this.sdi2; }
    
    public void setSdi3(RichShowDetailItem sdi3) { this.sdi3 = sdi3; }
    public RichShowDetailItem getSdi3() { return this.sdi3; }
    
    public void setSdi4(RichShowDetailItem sdi4) { this.sdi4 = sdi4; }
    public RichShowDetailItem getSdi4() { return this.sdi4; }
    
    public void setSdi5(RichShowDetailItem sdi5) { this.sdi5 = sdi5; }
    public RichShowDetailItem getSdi5() { return this.sdi5; }
    
    public void setSdi6(RichShowDetailItem sdi6) { this.sdi6 = sdi6; }
    public RichShowDetailItem getSdi6() { return this.sdi6; }
    
    public void setSdi7(RichShowDetailItem sdi7) { this.sdi7 = sdi7; }
    public RichShowDetailItem getSdi7() { return this.sdi7; }
    
    public void setSdi8(RichShowDetailItem sdi8) { this.sdi8 = sdi8; }
    public RichShowDetailItem getSdi8() { return this.sdi8; }
    
    public void setSdi9(RichShowDetailItem sdi9) { this.sdi9 = sdi9; }
    public RichShowDetailItem getSdi9() { return this.sdi9; }
    
    public void setSdi10(RichShowDetailItem sdi10) { this.sdi10 = sdi10; }
    public RichShowDetailItem getSdi10() { return this.sdi10; }
    
    public void setSdi11(RichShowDetailItem sdi11) { this.sdi11 = sdi11; }
    public RichShowDetailItem getSdi11() { return this.sdi11; }
    
    public void setSdi12(RichShowDetailItem sdi12) { this.sdi12 = sdi12; }
    public RichShowDetailItem getSdi12() { return this.sdi12; }
    
    public void setSdi13(RichShowDetailItem sdi13) { this.sdi13 = sdi13; }
    public RichShowDetailItem getSdi13() { return this.sdi13; }
    
    public void setSdi14(RichShowDetailItem sdi14) { this.sdi14 = sdi14; }
    public RichShowDetailItem getSdi14() { return this.sdi14; }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/* ------------------------------------------------------ Rich Link ---------------------------------------------------------*/    
    
    
    
    
    
    
    
    
    
    
    
    
    public void setL1(RichLink l1) { this.l1 = l1; }
    public RichLink getL1() { return this.l1; }

    public void setL2(RichLink l2) { this.l2 = l2; }
    public RichLink getL2() { return l2; }
    
    public void setL3(RichLink l3) { this.l3 = l3; }
    public RichLink getL3() { return this.l3; }
      
      public void setL4(RichLink l4) { this.l4 = l4; }      
      public RichLink getL4() { return this.l4; }
      
      public void setL5(RichLink l5) { this.l5 = l5; }      
      public RichLink getL5() { return this.l5; }
      
      public void setL6(RichLink l6) { this.l6 = l6; }      
      public RichLink getL6() { return this.l6; }
      
      public void setL7(RichLink l7) { this.l7 = l7; }      
      public RichLink getL7() { return this.l7; }
      
      public void setL8(RichLink l8) { this.l8 = l8; }      
      public RichLink getL8() { return this.l8; }
      
      public void setL9(RichLink l9) { this.l9 = l9; }      
      public RichLink getL9() { return this.l9; }
      
      public void setL10(RichLink l10) { this.l10 = l10; }      
      public RichLink getL10() { return this.l10; }
      
      public void setL11(RichLink l11) { this.l11 = l11; }      
      public RichLink getL11() { return this.l11; }
      
      public void setL12(RichLink l12) { this.l12 = l12; }      
      public RichLink getL12() { return this.l12; }
      
      public void setL13(RichLink l13) { this.l13 = l13; }      
      public RichLink getL13() { return this.l13; }
      
      public void setL14(RichLink l14) { this.l14 = l14; }     
      public RichLink getL14() { return this.l14; }
    
    public void setL15(RichLink l15) { this.l15 = l15; }
    public RichLink getL15() { return this.l15; }
    
    public void setL16(RichLink l16) { this.l16 = l16; }
    public RichLink getL16() { return this.l16; }
      
      public void setL17(RichLink l17) { this.l17 = l17; }      
      public RichLink getL17() { return this.l17; }

    public void setL18(RichLink l18) { this.l18 = l18; }  
    public RichLink getL18() { return this.l18; }

    public void setL19(RichLink l19) { this.l19 = l19; }  
    public RichLink getL19() { return this.l19; }
    
    public void setL20(RichLink l20) { this.l20 = l20; }  
    public RichLink getL20() { return this.l20; }

    public void setL21(RichLink l21) { this.l21 = l21; }  
    public RichLink getL21() { return this.l21; }
    
    public void setL22(RichLink l22) { this.l22 = l22; }  
    public RichLink getL22() { return this.l22; }
    
    public void setL23(RichLink l23) { this.l23 = l23; } 
      public RichLink getL23() { return this.l23; }
     
      public void setL24(RichLink l24) { this.l24 = l24; }
      public RichLink getL24() { return this.l24; }
      
    public void setL25(RichLink l25) { this.l25 = l25; }  
    public RichLink getL25() { return this.l25; }
    
    public void setL26(RichLink l26) { this.l26 = l26; }
    public RichLink getL26() { return this.l26; }

    public void setL27(RichLink l27) { this.l27 = l27; }  
    public RichLink getL27() { return this.l27; }
    
    public void setL28(RichLink l28) { this.l28 = l28; }  
    public RichLink getL28() { return this.l28; }
    
    public void setL29(RichLink l29) { this.l29 = l29; }  
    public RichLink getL29() { return this.l29; }
    
    public void setL30(RichLink l30) { this.l30 = l30; }  
    public RichLink getL30() { return this.l30; }
    
    public void setL31(RichLink l31) { this.l31 = l31; }  
    public RichLink getL31() { return this.l31; }
    
    public void setL32(RichLink l32) { this.l32 = l32; }  
    public RichLink getL32() { return this.l32; }
    
    public void setL33(RichLink l33) { this.l33 = l33; }  
    public RichLink getL33() { return this.l33; }
    
    public void setL34(RichLink l34) { this.l34 = l34; }  
    public RichLink getL34() { return this.l34; }
    
    
    
    
    
    
  /*--------------------------------------------Rich Region ------------------------------------------------------*/
    
    
    
    
    
    
    public void setR1(RichRegion r1) { this.r1 = r1; } 
     public RichRegion getR1() { return this.r1; }
     
     public void setR2(RichRegion r2) { this.r2 = r2; }
     public RichRegion getR2() { return this.r2; }
     
     public void setR12(RichRegion r12) { this.r12 = r12; }  
     public RichRegion getR12() { return this.r12; }
    
     public void setR11(RichRegion r11) { this.r11 = r11; }  
     public RichRegion getR11() { return this.r11; }
     
     public void setR13(RichRegion r13) { this.r13 = r13; }  
     public RichRegion getR13() { return this.r13; }
     
     public void setR7(RichRegion r7) { this.r7 = r7; }  
     public RichRegion getR7() { return this.r7; }
     
     public void setR8(RichRegion r8) { this.r8 = r8; }  
     public RichRegion getR8() { return this.r8; }

     public void setR16(RichRegion r16) { this.r16 = r16; } 
     public RichRegion getR16() { return this.r16; }
    
     public void setR21(RichRegion r21) { this.r21 = r21; }
     public RichRegion getR21() { return this.r21; }

     
     
     public void setR3(RichRegion r3) { this.r3 = r3; }  
     public RichRegion getR3() { return this.r3; }
     
     public void setR5(RichRegion r5) { this.r5 = r5; }  
     public RichRegion getR5() { return this.r5; }
     
     public void setR6(RichRegion r6) { this.r6 = r6; }  
     public RichRegion getR6() { return this.r6; }
     
     public void setR23(RichRegion r23) { this.r23 = r23; }  
     public RichRegion getR23() { return this.r23; }
     
     
     
     public void setR24(RichRegion r24) { this.r24 = r24; }  
     public RichRegion getR24() { return this.r24; }

     
     
     
     public void setR25(RichRegion r25) { this.r25 = r25; }  
     public RichRegion getR25() { return this.r25; }
     
     public void setR26(RichRegion r26) { this.r26 = r26; }  
     public RichRegion getR26() { return this.r26; }
     
     public void setR4(RichRegion r4) { this.r4 = r4; }  
     public RichRegion getR4() { return this.r4; }
       
     
     
     public void setR28(RichRegion r28) { this.r28 = r28; }  
     public RichRegion getR28() { return this.r28; }
     
     public void setR29(RichRegion r29) { this.r29 = r29; }  
     public RichRegion getR29() { return this.r29; }
     
     public void setR30(RichRegion r30) { this.r30 = r30; }  
     public RichRegion getR30() { return this.r30; }
     
     public void setR31(RichRegion r31) { this.r31 = r31; }  
     public RichRegion getR31() { return this.r31; }
     
     public void setR32(RichRegion r32) { this.r32 = r32; }  
     public RichRegion getR32() { return this.r32; }
     
     public void setR9(RichRegion r9) { this.r9 = r9; }  
     public RichRegion getR9() { return this.r9; }
       
     
     
     public void setR33(RichRegion r33) { this.r33 = r33; }  
     public RichRegion getR33() { return this.r33; }
     
     public void setR14(RichRegion r14) { this.r14 = r14; }  
     public RichRegion getR14() { return this.r14; }
     
     public void setR17(RichRegion r17) { this.r17 = r17; }  
     public RichRegion getR17() { return this.r17; }
     
     public void setR15(RichRegion r15) { this.r15 = r15; }  
     public RichRegion getR15() { return this.r15; }
     
     public void setR18(RichRegion r18) { this.r18 = r18; }  
     public RichRegion getR18() { return this.r18; }
     
     public void setR19(RichRegion r19) { this.r19 = r19; }  
     public RichRegion getR19() { return this.r19; }
     
     public void setR10(RichRegion r10) { this.r10 = r10; }  
     public RichRegion getR10() { return this.r10; }
     
    public void setR22(RichRegion r22) { this.r22 = r22; }  
    public RichRegion getR22() { return this.r22; }
    
     //public void setL34(RichLink l34) { this.l34 = l34; }  
     //public RichLink getL34() { return this.l34; }
     
     public void setR20(RichRegion r20) { this.r20 = r20; }  
     public RichRegion getR20() { return this.r20; }
     
     public void setOt1(RichOutputText ot1) { this.ot1 = ot1; }  
     public RichOutputText getOt1() { return this.ot1; }
    
    
    
    

    public void setFacetname(String facetname) {
        this.facetname = facetname;
    }
    public String getFacetname() {
        return facetname;
    }

    public void setS1(UIXSwitcher s1) { this.Switcher = s1; }
    public UIXSwitcher getS1() { return Switcher; }
    
    public String ChangeSwitcher() {
            ControllerContext controllerContext=ControllerContext.getInstance();
            ViewPortContext currentRootViewPort = controllerContext.getCurrentRootViewPort();
            boolean isDataDirty = currentRootViewPort.isDataDirty();
                if (true == isDataDirty) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("There is uncommittaed data on page"));
            }else{               
                if (getFacetname() != null) {
                    Switcher.setFacetName(getFacetname());
                    RequestContext.getCurrentInstance().addPartialTarget(Switcher);                   
                }    
            }
           return null;
        }
}

