package view.backing;

import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.controller.ControllerContext;
import oracle.adf.controller.ViewPortContext;
import oracle.adf.view.rich.component.rich.RichDocument;


import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;


import oracle.adf.view.rich.component.rich.output.RichSpacer;

import org.apache.myfaces.trinidad.component.UIXSwitcher;
import org.apache.myfaces.trinidad.context.RequestContext;


public class MyHomeView {
    private String FacetName;
    private UIXSwitcher Switcher;
    private RichDocument d1;
    private RichButton b2;
    private UIXSwitcher s1;
    private RichToolbar t2;
    private RichButton b6;
    private RichButton b7;
    private RichButton b8;
    private RichButton b9;
    private RichButton b11;
    private RichButton b10;
    private RichButton b12;
    private RichSpacer s2;
    private RichButton b15;
    private RichButton b4;
    private RichButton b13;

    public void setFacetName(String FacetName) {
        this.FacetName = FacetName;
    }

    public String getFacetName() {
        return FacetName;
    }
    public String ChangeSwitcher() {

        if (getFacetName() != null) {

            Switcher.setFacetName(getFacetName());
            RequestContext.getCurrentInstance().addPartialTarget(Switcher);
            

        }

        return null;

    }

    public void setSwitcher(UIXSwitcher Switcher) {
        this.Switcher = Switcher;
    }

    public UIXSwitcher getSwitcher() {
        return Switcher;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }
    public String RefreshAction(ActionEvent actionEvent) {
        ControllerContext controllerContext=ControllerContext.getInstance();
        ViewPortContext currentRootViewPort = controllerContext.getCurrentRootViewPort();
        boolean isDataDirty = currentRootViewPort.isDataDirty();
        if (true == isDataDirty) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("There is uncommittaed data on page"));
        }else{
            FacesContext fc = FacesContext.getCurrentInstance();
            String refreshpage = fc.getViewRoot().getViewId();
            ViewHandler ViewH = fc.getApplication().getViewHandler();
            UIViewRoot UIV = ViewH.createView(fc, refreshpage);
            UIV.setViewId(refreshpage);
            fc.setViewRoot(UIV);    
        }
        return null;
    }


    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setS1(UIXSwitcher s1) {
        this.s1 = s1;
    }

    public UIXSwitcher getS1() {
        return s1;
    }


    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }


    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setB7(RichButton b7) {
        this.b7 = b7;
    }

    public RichButton getB7() {
        return b7;
    }

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }


    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }


    public void setB15(RichButton b15) {
        this.b15 = b15;
    }

    public RichButton getB15() {
        return b15;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setB13(RichButton b13) {
        this.b13 = b13;
    }

    public RichButton getB13() {
        return b13;
    }


}
