/*
 * Copyright 2014 Higher Frequency Trading
 * <p/>
 * http://www.higherfrequencytrading.com
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.chronicle.logger;

import org.junit.Test;

import static net.openhft.chronicle.logger.ChronicleLogLevel.fastEqualsIgnoreCase;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ChronicleLogLevelTest {

    @Test
    public void fastEqualsIgnoreCaseTest() {
        assertTrue(fastEqualsIgnoreCase("ERROR", new String("ERROR")));
        assertTrue(fastEqualsIgnoreCase("ERROR", "error"));
        assertTrue(fastEqualsIgnoreCase("ERROR", "eRrOr"));

        assertFalse(fastEqualsIgnoreCase("ERROR", "ERRO"));
        assertFalse(fastEqualsIgnoreCase("ERROR", "ERRORR"));
        assertFalse(fastEqualsIgnoreCase("ERROR", "ERRAR"));
    }
}