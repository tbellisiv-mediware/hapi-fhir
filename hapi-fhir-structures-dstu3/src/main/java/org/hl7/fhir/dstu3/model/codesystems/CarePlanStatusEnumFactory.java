package org.hl7.fhir.dstu3.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sat, Nov 5, 2016 08:41-0400 for FHIR v1.7.0


import org.hl7.fhir.dstu3.model.EnumFactory;

public class CarePlanStatusEnumFactory implements EnumFactory<CarePlanStatus> {

  public CarePlanStatus fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("proposed".equals(codeString))
      return CarePlanStatus.PROPOSED;
    if ("draft".equals(codeString))
      return CarePlanStatus.DRAFT;
    if ("active".equals(codeString))
      return CarePlanStatus.ACTIVE;
    if ("suspended".equals(codeString))
      return CarePlanStatus.SUSPENDED;
    if ("completed".equals(codeString))
      return CarePlanStatus.COMPLETED;
    if ("entered-in-error".equals(codeString))
      return CarePlanStatus.ENTEREDINERROR;
    if ("cancelled".equals(codeString))
      return CarePlanStatus.CANCELLED;
    if ("unknown".equals(codeString))
      return CarePlanStatus.UNKNOWN;
    throw new IllegalArgumentException("Unknown CarePlanStatus code '"+codeString+"'");
  }

  public String toCode(CarePlanStatus code) {
    if (code == CarePlanStatus.PROPOSED)
      return "proposed";
    if (code == CarePlanStatus.DRAFT)
      return "draft";
    if (code == CarePlanStatus.ACTIVE)
      return "active";
    if (code == CarePlanStatus.SUSPENDED)
      return "suspended";
    if (code == CarePlanStatus.COMPLETED)
      return "completed";
    if (code == CarePlanStatus.ENTEREDINERROR)
      return "entered-in-error";
    if (code == CarePlanStatus.CANCELLED)
      return "cancelled";
    if (code == CarePlanStatus.UNKNOWN)
      return "unknown";
    return "?";
  }

    public String toSystem(CarePlanStatus code) {
      return code.getSystem();
      }

}
