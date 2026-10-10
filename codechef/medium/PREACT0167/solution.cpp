
    // --- SOLUTION: Define state for yearsExperience ---
    const [yearsExperience, setYearsExperience] = useState('0-1');
    const [company, setCompany] = useState('');


    // --- SOLUTION: Define state for company ---
    // --- SOLUTION: Define state for jobTitle ---
    const [jobTitle, setJobTitle] = useState('');
    const [address, setAddress] = useState('');


    // --- SOLUTION: Define state for address ---
    // --- SOLUTION: Define state for phone ---
    const [phone, setPhone] = useState('');
    const [email, setEmail] = useState('');


    // --- SOLUTION: Define state for phone ---
    // --- SOLUTION: Define state for phone ---
    const [fullName, setFullName] = useState('');
    const isLastTab = activeTabIndex === totalTabs - 1;

    const totalTabs = 3;
    const isFirstTab = activeTabIndex === 0;

function Tabs({ activeTabIndex, onPrevious, onNext, onTabClick }) {
import {useState} from 'react';