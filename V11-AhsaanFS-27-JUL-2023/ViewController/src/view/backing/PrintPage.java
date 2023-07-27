package view.backing;

import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.faces.event.PhaseId;


import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class PrintPage {
    public PrintPage() {
        super();
    }
    
    public void beforePhaseMethod(PhaseEvent phaseEvent) {
            
            if(phaseEvent.getPhaseId() == PhaseId.RENDER_RESPONSE){
                System.out.println("Inside IF");
                FacesContext fctx = FacesContext.getCurrentInstance();
                System.out.println("Current Instance" + fctx);
                Map requestMap = fctx.getExternalContext().getRequestMap();
                System.out.println("Map" + requestMap);
                Object showPrintableBehavior = requestMap.get("oracle.adfinternal.view.faces.el.PrintablePage");
                System.out.println("showPrintableBehavior" + showPrintableBehavior);
                if (showPrintableBehavior != null) {
                    if(Boolean.TRUE == showPrintableBehavior){
                        ExtendedRenderKitService erks = null;
                        erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
                        erks.addScript(fctx, "window.print();");
                    }
                }
            }
        }
}
