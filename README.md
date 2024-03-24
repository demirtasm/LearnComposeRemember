Composable fonksiyonlar remember ile işaretlenmiş objeleri hafızada saklayabilirler.
 Bu sayede objenin içeriği değiştiği zaman o objeyi işaret eden tüm viewlar recompositiona(yeniden çizdirilme) uğramış olur.
 
val mutableState = remember { mutableStateOf(default) }  //value ya erişmek için mutableState.value
val value by remember { mutableStateOf(default) }  //direk valuenun kendisine erişebilirsin
val (value, setValue) = remember { mutableStateOf(default) }
