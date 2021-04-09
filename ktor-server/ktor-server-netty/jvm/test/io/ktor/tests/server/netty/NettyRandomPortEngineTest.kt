/*
 * Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.tests.server.netty

import io.ktor.server.netty.*
import io.ktor.server.testing.suites.*

class NettyRandomPortEngineTest :
    RandomPortTestSuite<NettyApplicationEngine, NettyApplicationEngine.Configuration>(Netty) {
}