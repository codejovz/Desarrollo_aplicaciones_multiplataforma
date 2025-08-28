
import 'package:flutter/material.dart';
//My widgets
import 'package:feed_cards/screens/home_screen.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(  // Aquí el autocompletado debería sugerir MaterialApp
      debugShowCheckedModeBanner: false,
      title: 'Feed cards',
      home: HomeScreen(),
    );
  }
}


