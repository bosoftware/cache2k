package org.cache2k.core.util;

/*
 * #%L
 * cache2k core
 * %%
 * Copyright (C) 2000 - 2018 headissue GmbH, Munich
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.cache2k.Clock;

/**
 * @author Jens Wilke
 */
public interface InternalClock extends Clock {

  /**
   * Returns the milliseconds since epoch.
   */
  long millis();

  /**
   * Wait for the specified amount of time in milliseconds.
   * The value of 0 means that the thread may sleep some tiny amount of time
   * or not at all.
   */
  void sleep(long _millis) throws InterruptedException;

  /**
   *
   */
  boolean isJobSchedulable();

  TimeReachedJob createJob(TimeReachedEvent ev);

  void schedule(TimeReachedJob j, long _millis);

  void disableJob(TimeReachedJob j);

  interface TimeReachedEvent {
    void timeIsReached(long _millis);
  }

  interface TimeReachedJob { }

}