package com.example.api

data class DataFile(val page:Int, val per_page:Int, val total:Int, val total_pages:Int, val data:List<Data>)