package com.kroissant.models

import kotlinx.serialization.Serializable

@Serializable
data class DependencyModel(val configurationName: String, val name: String, val group: String,val version: String)