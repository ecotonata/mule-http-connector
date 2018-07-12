/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.http.internal.request.exception;

import org.mule.extension.http.api.request.validator.ResponseValidatorException;
import org.mule.runtime.api.message.Message;

public class InternalResponseValidatorException extends ResponseValidatorException {

  private Message errorMessage;

  public InternalResponseValidatorException(ResponseValidatorException exception, Message handledMessage) {
    super(exception.getMessage());
    this.errorMessage = handledMessage;
  }

  @Override
  public Message getErrorMessage() {
    return errorMessage;
  }
}
