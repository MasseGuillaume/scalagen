/*
 * Copyright (C) 2011, Mysema Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mysema.scalagen

import com.github.javaparser.JavaParser
import com.github.javaparser.ParseException
import com.github.javaparser.ast.CompilationUnit
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import org.apache.commons.io.FileUtils
import org.junit.Test
import TestDirectoryStructure._

class ScalaDumpVisitorTest extends AbstractParserTest {

  @Test
  def Dump {
    val resources = EXAMPLE_FILE_DIR.listFiles()
    for (res <- resources if res.getName.endsWith(".java")) {
      val out = new File("target/" + res.getName.substring(0, res.getName.length() - 5) + ".scala")
      Converter.instance.convertFile(res, out)
    }
  }
}
