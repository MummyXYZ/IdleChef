package com.mummyx.idlechef

import kotlinx.coroutines.Job

interface JobHolder {
    val job: Job
}