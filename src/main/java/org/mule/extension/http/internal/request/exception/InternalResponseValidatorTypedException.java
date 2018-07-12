/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.http.internal.request.exception;

import org.mule.extension.http.api.error.HttpError;
import org.mule.extension.http.api.request.validator.ResponseValidatorTypedException;
import org.mule.runtime.api.message.Message;

public class InternalResponseValidatorTypedException extends ResponseValidatorTypedException {

  private Message errorMessage;

  public InternalResponseValidatorTypedException(ResponseValidatorTypedException exception, Message handledMessage) {
    super(exception.getMessage(), (HttpError) exception.getType());
    this.errorMessage = handledMessage;
  }

  @Override
  public Message getErrorMessage() {
    return errorMessage;
  }
}
