import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({
    super.key,
  });

  @override
  Widget build(BuildContext context) {
    const textStyle = TextStyle(
      color: Colors.grey,
      fontWeight: FontWeight.bold,
      fontSize: 16,
    );






    return Scaffold(   //
      appBar: AppBar(
          title: const Text('Feed card'),
          backgroundColor: Colors.green
      ),
      body: Container(
        width: double.infinity,
        height: 350,
        margin: const EdgeInsets.all(20),
        decoration: const BoxDecoration(color: Colors.white),
      child: Container(
        child: Column(
          children: [
            Container(
              padding: const EdgeInsets.all(10),
              child: const Row(
                children: [
                  CircleAvatar(
                    child: Text("J"),
                  ), SizedBox(width:10),
                  Text(
                    "Jorge",
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                        fontSize: 20,
                        color: Color.fromARGB(255,35,35,35)
                    )
                    )
                ],
              ),
            ),
            Padding(
              padding: const EdgeInsets.only(left:10, right: 10, bottom: 10),
              child: Text("Hola no se que escribir es para el ejemplo no voy a copiar lo que dice el chico en el video",
              maxLines: 1,
              overflow: TextOverflow.ellipsis,
              style: TextStyle(color: Colors.grey)),
            ),
            Container(
              child: Image.network("https://avatars.githubusercontent.com/u/58860938?v=4",
              fit: BoxFit.contain,
              ),
              width: double.infinity,
              height: 200,
            ),
            Container(
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceAround,
                children: [
                  TextButton(onPressed: (){},child: const Text( "Me gusta", style: textStyle)),
                  TextButton(onPressed: (){},child: const Text( "Comentar", style: textStyle)),
                  TextButton(onPressed: (){},child: const Text( "Compartir", style: textStyle)),
                ],
              ),
            )
          ],
        ),
      ),
      ),
      backgroundColor: Colors.grey[300],
    );
  }
}