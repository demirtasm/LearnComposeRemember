Composable fonksiyonlar remember ile işaretlenmiş objeleri hafızada saklayabilirler.
 Bu sayede objenin içeriği değiştiği zaman o objeyi işaret eden tüm viewlar recompositiona(yeniden çizdirilme) uğramış olur.
 
val mutableState = remember { mutableStateOf(default) }
val value by remember { mutableStateOf(default) }
val (value, setValue) = remember { mutableStateOf(default) }
