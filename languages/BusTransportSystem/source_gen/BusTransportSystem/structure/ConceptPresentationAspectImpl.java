package BusTransportSystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Adult;
  private ConceptPresentation props_Baggage;
  private ConceptPresentation props_Booking;
  private ConceptPresentation props_Bus;
  private ConceptPresentation props_Child;
  private ConceptPresentation props_City;
  private ConceptPresentation props_KIOSK;
  private ConceptPresentation props_OnlinePayment;
  private ConceptPresentation props_Passenger;
  private ConceptPresentation props_Payment;
  private ConceptPresentation props_Seat;
  private ConceptPresentation props_Ticket;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Adult:
        if (props_Adult == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Adult = cpb.create();
        }
        return props_Adult;
      case LanguageConceptSwitch.Baggage:
        if (props_Baggage == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Baggage = cpb.create();
        }
        return props_Baggage;
      case LanguageConceptSwitch.Booking:
        if (props_Booking == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Booking = cpb.create();
        }
        return props_Booking;
      case LanguageConceptSwitch.Bus:
        if (props_Bus == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Bus = cpb.create();
        }
        return props_Bus;
      case LanguageConceptSwitch.Child:
        if (props_Child == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Child = cpb.create();
        }
        return props_Child;
      case LanguageConceptSwitch.City:
        if (props_City == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_City = cpb.create();
        }
        return props_City;
      case LanguageConceptSwitch.KIOSK:
        if (props_KIOSK == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_KIOSK = cpb.create();
        }
        return props_KIOSK;
      case LanguageConceptSwitch.OnlinePayment:
        if (props_OnlinePayment == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_OnlinePayment = cpb.create();
        }
        return props_OnlinePayment;
      case LanguageConceptSwitch.Passenger:
        if (props_Passenger == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Passenger = cpb.create();
        }
        return props_Passenger;
      case LanguageConceptSwitch.Payment:
        if (props_Payment == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Payment = cpb.create();
        }
        return props_Payment;
      case LanguageConceptSwitch.Seat:
        if (props_Seat == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Seat = cpb.create();
        }
        return props_Seat;
      case LanguageConceptSwitch.Ticket:
        if (props_Ticket == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Ticket = cpb.create();
        }
        return props_Ticket;
    }
    return null;
  }
}
