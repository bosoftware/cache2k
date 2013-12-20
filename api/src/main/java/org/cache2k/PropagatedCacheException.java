package org.cache2k;

/*
 * #%L
 * cache2k api only package
 * %%
 * Copyright (C) 2000 - 2013 headissue GmbH, Munich
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

/**
 * If a cache receives an exception when fetching a value via the
 * cache source it may propagate the exception wrapped into this
 * one to the callee. If propagation occurs depends on the configuration
 * and whether there is some useful value from a previous fetch.
 *
 * @author Jens Wilke
 */
public class PropagatedCacheException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public PropagatedCacheException(Throwable ex) {
    super(ex == null ? "null!" : "", ex);
  }

}